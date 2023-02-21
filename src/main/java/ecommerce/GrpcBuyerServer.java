package ecommerce;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GrpcBuyerServer extends ecommerce.BuyerGrpc.BuyerImplBase{
    private static long BuyeridCounter = 0;

    public static synchronized long createBuyerID() {
        return BuyeridCounter++;
    }
    private static long transactionidCounter = 0;

    public static synchronized long createtransactionID() {
        return transactionidCounter++;
    }

    public void loginBuyer(ecommerce.loginBuyerRequest request,
                           io.grpc.stub.StreamObserver<ecommerce.loginBuyerResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();

        DynamoDBQueryExpression<Buyer> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Buyer((request.getBuyerId())));

        PaginatedQueryList<Buyer> list = db.query(Buyer.class, query);
        String response ="";
        Iterator<Buyer> iter = list.iterator();
        if (!iter.hasNext())
            response = new StringBuilder().append("No buyer found.. create account").toString();

        else {
            Buyer currentUser = iter.next();
            if (currentUser.getPassword().equals(request.getPassword())) {
                currentUser.setLoggedin(true);
                db.save(currentUser);
                response = new StringBuilder().append("Correct Password.. Logged in").toString();
            } else {
                response = new StringBuilder().append("Wrong Password").toString();
            }
        }
        loginBuyerResponse ans = loginBuyerResponse.newBuilder()
                .setLoginStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();

    }

    /**
     */
    public void createBuyerAccount(ecommerce.createBuyerAccountRequest request,
                                   io.grpc.stub.StreamObserver<ecommerce.createBuyerAccountResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Buyer> query = new DynamoDBQueryExpression<>();
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        PaginatedScanList<Buyer> list = db.scan(Buyer.class, scanExpression);
        String response ="";
        Iterator<Buyer> iter = list.iterator();
        while (iter.hasNext()) {
            Buyer currentUser = iter.next();
            if (currentUser.getBuyerName().equals(request.getUsername())) {
                response = new StringBuilder().append("Already Created Account").toString();

            }
        }
        Long buyerID = createBuyerID();
        Buyer buyer = new Buyer(request.getUsername(), buyerID, new ArrayList<>(), request.getPassword(), false);

        db.save(buyer);
        if(response=="")
        response = new StringBuilder().append("Buyer Account Created with buyerId: " + String.valueOf(buyerID)).toString();

        createBuyerAccountResponse ans = createBuyerAccountResponse.newBuilder()
                .setCreateAccountStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void logoutBuyer(ecommerce.logoutBuyerRequest request,
                            io.grpc.stub.StreamObserver<ecommerce.logoutBuyerResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Buyer> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Buyer(request.getBuyerId()));
        PaginatedQueryList<Buyer> list = db.query(Buyer.class, query);
        String response ="";
        Iterator<Buyer> iter = list.iterator();
        while (iter.hasNext()) {
            Buyer currentUser = iter.next();
            currentUser.setLoggedin(false);
            db.save(currentUser);
            response = new StringBuilder().append("Logged out.. Log in back.").toString();

        }
        if(response=="")
        response = new StringBuilder().append("No user").toString();
        logoutBuyerResponse ans = logoutBuyerResponse.newBuilder()
                .setLogoutStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void addToShoppingCart(ecommerce.addToShoppingCartRequest request,
                                  io.grpc.stub.StreamObserver<ecommerce.addToShoppingCartResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();

        DynamoDBQueryExpression<Item> query1 = new DynamoDBQueryExpression<>();
        query1.setHashKeyValues(new Item(request.getItemId()));
        PaginatedQueryList<Item> list1 = db.query(Item.class, query1);
        Iterator<Item> iter1 = list1.iterator();
        Item currentItem = null;
        while (iter1.hasNext()) {
            currentItem = iter1.next();
        }
        String response = "";
        if(currentItem==null)
        {
            response = new StringBuilder().append("No item with given Item id").toString();

        }
        else
        {
            currentItem.setItemQuantity(request.getQuantity());

            DynamoDBQueryExpression<ShoppingCart> query = new DynamoDBQueryExpression<>();
            query.setHashKeyValues(new ShoppingCart(request.getBuyerId()));
            PaginatedQueryList<ShoppingCart> list = db.query(ShoppingCart.class, query);
            Iterator<ShoppingCart> iter = list.iterator();
            List<Item> currentCart = new ArrayList<>();
            while (iter.hasNext()) {
                ShoppingCart shoppingCart = iter.next();
                currentCart = shoppingCart.getUserItems();
            }
            List<Item> updatedCart = new ArrayList<>();
            boolean match = false;
            for (int i = 0; i < currentCart.size(); i++) {
                if (currentCart.get(i).getItemId() != request.getItemId()) {
                    updatedCart.add(currentCart.get(i));
                } else {
                    Item currentItem1 = currentCart.get(i);
                    currentItem1.setItemQuantity(currentItem1.getItemQuantity() + request.getQuantity());
                    updatedCart.add(currentItem1);
                    match = true;
                }
            }
            if (!match)
                updatedCart.add(currentItem);
            ShoppingCart shoppingCart = new ShoppingCart(request.getBuyerId(), updatedCart);
            db.save(shoppingCart);
        }


        response = new StringBuilder().append("Added " + request.getQuantity() + " quantities of item with item id " + request.getItemId() + " to shopping cart").toString();
        addToShoppingCartResponse ans = addToShoppingCartResponse.newBuilder()
                .setAddToShoppingCartStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();

    }

    /**
     */
    public void removeFromShoppingCart(ecommerce.removeFromShoppingCartRequest request,
                                       StreamObserver<removeFromShoppingCartResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<ShoppingCart> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new ShoppingCart(request.getBuyerId()));
        PaginatedQueryList<ShoppingCart> list = db.query(ShoppingCart.class, query);
        Iterator<ShoppingCart> iter = list.iterator();
        List<Item> currentCart = new ArrayList<>();
        while (iter.hasNext()) {
            ShoppingCart shoppingCart = iter.next();
            currentCart = shoppingCart.getUserItems();
        }
        List<Item> updatedCart = new ArrayList<>();
        String response = "";
        for (int i = 0; i < currentCart.size(); i++) {
            if (currentCart.get(i).getItemId() != request.getItemId()) {
                updatedCart.add(currentCart.get(i));
            } else {
                if (currentCart.get(i).getItemQuantity() > request.getQuantity()) {
                    Item currentItem = currentCart.get(i);
                    currentItem.setItemQuantity(currentCart.get(i).getItemQuantity() - request.getQuantity());
                    updatedCart.add(currentItem);
                }
                else {

                    response = new StringBuilder().append("Given more than available qnty to remove").toString();

                }
            }
        }
        ShoppingCart shoppingCart = new ShoppingCart(request.getBuyerId(), updatedCart);
        db.save(shoppingCart);
        if(updatedCart.isEmpty())
        {
//            clearShoppingCart(clearShoppingCartRequest.newBuilder()
//                   .setBuyerId(request.getBuyerId())
//                   .build());
        }
        if(response=="")
            response = new StringBuilder().append("Removed " + request.getQuantity() + " quantities of item with item id " + request.getItemId() + " from shopping cart").toString();

        removeFromShoppingCartResponse ans = removeFromShoppingCartResponse.newBuilder()
                .setRemoveFromShoppingCartStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void clearShoppingCart(ecommerce.clearShoppingCartRequest request,
                                  io.grpc.stub.StreamObserver<ecommerce.clearShoppingCartResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<ShoppingCart> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new ShoppingCart(request.getBuyerId()));
        PaginatedQueryList<ShoppingCart> list = db.query(ShoppingCart.class, query);
        Iterator<ShoppingCart> iter = list.iterator();
        String response ="";
        if (!iter.hasNext())
            response = new StringBuilder().append("buyerId " + request.getBuyerId() + " doesn't have shopping cart").toString();

        ShoppingCart shoppingCart = null;
        while (iter.hasNext()) {
            shoppingCart = iter.next();
        }
        db.delete(shoppingCart);
        if(response=="")
        response = new StringBuilder().append("Shopping cart cleared for buyer id: " + request.getBuyerId()).toString();


        clearShoppingCartResponse ans = clearShoppingCartResponse.newBuilder()
                .setClearShoppingCartStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void displayShoppingCart(ecommerce.displayShoppingCartRequest request,
                                    io.grpc.stub.StreamObserver<ecommerce.displayShoppingCartResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<ShoppingCart> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new ShoppingCart(request.getBuyerId()));
        PaginatedQueryList<ShoppingCart> list = db.query(ShoppingCart.class, query);
        Iterator<ShoppingCart> iter = list.iterator();
        String response = "";
        if (!iter.hasNext())
            response = new StringBuilder().append("buyerId " + request.getBuyerId() + " doesn't have shopping cart").toString();
        StringBuilder ans = new StringBuilder();
        ShoppingCart shoppingCart = null;
        while (iter.hasNext()) {
            shoppingCart = iter.next();
        }
        if(shoppingCart==null)
        {
            response = new StringBuilder().append("buyerId " + request.getBuyerId() + " doesn't have shopping cart").toString();
        }
        else
        {
            List<Item> currentItems = shoppingCart.getUserItems();
            for(int i=0;i<currentItems.size();i++)
            {
                ans.append(" Item Name: " + currentItems.get(i).getItemName() + ", its quantity: " + currentItems.get(i).getItemQuantity());
                ans.append("\n");
            }
            if(response==null)
                response = new StringBuilder().append("Shopping cart for buyer id: " + request.getBuyerId() + " " + ans.toString()).toString();


        }
        displayShoppingCartResponse ans1 = displayShoppingCartResponse.newBuilder()
                .setDisplayShoppingCartStatus(response)
                .build();
        responseObserver.onNext(ans1);
        responseObserver.onCompleted();

    }

    /**
     */
    public void sellerRating(ecommerce.sellerRatingByBuyerRequest request,
                             io.grpc.stub.StreamObserver<ecommerce.sellerRatingByBuyerResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> list = db.query(Seller.class, query);
        Iterator<Seller> iter = list.iterator();
        double rating = 0;
        String response = "";
        if(!iter.hasNext())
            response = new StringBuilder().append("No seller found.. provide correct id").toString();

        else {
            Seller currentUser = iter.next();
            List<Integer> feedback = currentUser.getFeedback();
            if((feedback.get(0)+feedback.get(1))!=0)
                rating = (double) (feedback.get(0)-feedback.get(1))/(double)(feedback.get(0)+feedback.get(1));

        }
        if(response=="")
            response = new StringBuilder().append("Seller Rating is: " + String.valueOf(rating)).toString();

        sellerRatingByBuyerResponse ans1 = sellerRatingByBuyerResponse.newBuilder()
                .setRatingStatus(response)
                .build();

        responseObserver.onNext(ans1);
        responseObserver.onCompleted();
    }

    /**
     */
    public void feedBackSeller(ecommerce.feedBackSellerRequest request,
                               io.grpc.stub.StreamObserver<ecommerce.feedBackSellerResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Item> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Item(request.getItemId()));
        PaginatedQueryList<Item> list = db.query(Item.class, query);
        Iterator<Item> iter = list.iterator();
        Item currentItem = null;
        String response = "";

        if(!iter.hasNext())
            response = new StringBuilder().append("No item found.. provide correct id").toString();
        else {
            currentItem = iter.next();
        }
        Long sellerId = currentItem.getSellerId();
        DynamoDBQueryExpression<Seller> query1 = new DynamoDBQueryExpression<>();
        query1.setHashKeyValues(new Seller(sellerId));
        PaginatedQueryList<Seller> list1 = db.query(Seller.class, query1);
        Iterator<Seller> iter1 = list1.iterator();
        Seller currentSeller = null;
        if(iter1.hasNext()) {
            currentSeller = iter1.next();
        }
        List<Integer> feedback = currentSeller.getFeedback();
        if(request.getRating()>0)
        {
            int current = feedback.get(0);
            feedback.set(0,current+1);
        }
        else
        {
            int current = feedback.get(1);
            feedback.set(1,current+1);
        }
        currentSeller.setFeedback(feedback);
        db.save(currentSeller);
        if(response=="")
        response = new StringBuilder().append("feedback given for seller: " + String.valueOf(currentSeller.getSellerId())).toString();

        feedBackSellerResponse ans1 = feedBackSellerResponse.newBuilder()
                .setFeedBackSellerStatus(response)
                .build();

        responseObserver.onNext(ans1);
        responseObserver.onCompleted();
    }

    /**
     */
    public void purchaseHistory(ecommerce.purchaseHistoryRequest request,
                                io.grpc.stub.StreamObserver<ecommerce.purchaseHistoryResponse> responseObserver) {

        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Buyer> query1 = new DynamoDBQueryExpression<>();
        query1.setHashKeyValues(new Buyer(request.getBuyerId()));
        PaginatedQueryList<Buyer> list1 = db.query(Buyer.class, query1);
        Iterator<Buyer> iter1 = list1.iterator();
        Buyer currentUser = null;
        String response = "";
        if (!iter1.hasNext())
            response = new StringBuilder().append("No buyer found.. create account").toString();

        else {
            currentUser = iter1.next();
        }
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        PaginatedScanList<Transactions> list = db.scan(Transactions.class, scanExpression);
        Iterator<Transactions> iter = list.iterator();
        List<Transactions> transactions = new ArrayList<>();
        while (!iter.hasNext())
        {
            Transactions currentTransaction = iter.next();
            if(currentTransaction.getBuyerId()==request.getBuyerId())
            {
                transactions.add(currentTransaction);
            }
        }
        StringBuilder ans = new StringBuilder();
        if (transactions.size()==0)
            response = new StringBuilder().append("No purchase history").toString();
        else {

            for(int i=0;i<transactions.size();i++)
            {
                for(Item currentItem: transactions.get(i).getUserItems() )
                    ans.append(currentItem.getItemName()+ ", quantity of: "+String.valueOf(currentItem.getItemQuantity()));
                ans.append(", ");
            }
        }
        if(response=="")
            response = new StringBuilder().append("your purchaseHistory is: " + ans.toString()).toString();
        purchaseHistoryResponse ans1 = purchaseHistoryResponse.newBuilder()
                .setPurchaseHistoryStatus(response)
                .build();

        responseObserver.onNext(ans1);
        responseObserver.onCompleted();


    }

    /**
     */
    public void makePurchase(ecommerce.makePurchaseRequest request,
                             io.grpc.stub.StreamObserver<ecommerce.makePurchaseResponse> responseObserver) {
        Long buyerId = request.getBuyerId();
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<ShoppingCart> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new ShoppingCart(buyerId));
        PaginatedQueryList<ShoppingCart> list = db.query(ShoppingCart.class, query);
        Iterator<ShoppingCart> iter = list.iterator();
        String response = "";
        if (!iter.hasNext())
            response = new StringBuilder().append("buyerId " + String.valueOf(buyerId) + " doesn't have shopping cart to make purchase").toString();

        ShoppingCart shoppingCart = null;
        while (iter.hasNext()) {
            shoppingCart = iter.next();
        }
        if(shoppingCart==null)
        {
            response = new StringBuilder().append("buyerId " + request.getBuyerId() + " doesn't have shopping cart").toString();
        }
        else {

            String buyerName = request.getBuyerName();
            String cardNumber = request.getCardNumber();
            String expiryDate = request.getExpiryDate();
            boolean purchaseStatus = SoapTransaction.purchaseStatus(buyerName, cardNumber, expiryDate);
            if (purchaseStatus) {
                List<Item> currentItems = shoppingCart.getUserItems();
                Long transactionID = createtransactionID();
                Transactions transaction = new Transactions(transactionID, buyerId, currentItems);
                db.save(transaction);
                for (int i = 0; i < currentItems.size(); i++) {
                    Item currentItem = currentItems.get(i);
                    DynamoDBQueryExpression<Item> query1 = new DynamoDBQueryExpression<>();
                    query1.setHashKeyValues(new Item(currentItem.getItemId()));
                    PaginatedQueryList<Item> list1 = db.query(Item.class, query1);
                    Iterator<Item> iter1 = list1.iterator();
                    Item currentItemdb = null;
                    while (iter1.hasNext()) {
                        currentItemdb = iter1.next();
                    }
                    currentItemdb.setItemQuantity(currentItemdb.getItemQuantity() - currentItem.getItemQuantity());
                    db.save(currentItemdb);
                }
//            clearShoppingCart(new String[]{"6",components[1]});
                if (response == "")
                    response = new StringBuilder().append("Successful purchase.. inventory updated").toString();


            } else {
                if (response == "")
                    response = new StringBuilder().append("purchase failed.. card declined").toString();
            }
        }
        makePurchaseResponse ans1 = makePurchaseResponse.newBuilder()
                .setMakePurchaseStatus(response)
                .build();

        responseObserver.onNext(ans1);
        responseObserver.onCompleted();


    }

    /**
     */
    public void searchItems(ecommerce.searchItemsRequest request,
                            io.grpc.stub.StreamObserver<ecommerce.searchItemsResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Buyer> query = new DynamoDBQueryExpression<>();
//            PaginatedQueryList<Buyer> list = db.query(Buyer.class, query);
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
// Change to your model class
        PaginatedScanList<Item> list = db.scan(Item.class, scanExpression);
        Iterator<Item> iter = list.iterator();
        StringBuilder ans = new StringBuilder();

        while(iter.hasNext())
        {
            Item currentItem = iter.next();
            if(currentItem.getItemCategory()==request.getItemCategory())
            {
                List<String> keywords = currentItem.getKeywords();
                List<String> keywords1 = new ArrayList<>();
                for (int i = 3; i <= 7; i++) {
                    keywords1.add(request.getKeywords(i-3));
                }
                boolean match = false;
                for(int i=0;i<5;i++)
                {
                    for(String keyword:keywords)
                    {
                        if(keyword.equals(keywords1.get(0)))
                        {
                            match=true;
                            break;
                        }
                    }
                }

                if(match)
                {
                    ans.append(" Item id: " + currentItem.getItemId() + " its name: " + currentItem.getItemName());
                    ans.append(" \n");
                }

            }
        }
        String response = "";
        response = new StringBuilder().append("searched Items list: \n" + ans.toString()).toString();
        searchItemsResponse ans1 = searchItemsResponse.newBuilder()
                .setSearchItemsStatus(response)
                .build();

        responseObserver.onNext(ans1);
        responseObserver.onCompleted();

    }

}
