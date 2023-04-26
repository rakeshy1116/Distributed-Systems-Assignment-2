package ecommerce;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ecommerce.DynamoDBSample;

public class GrpcSellerServer extends ecommerce.SellerGrpc.SellerImplBase{

    private static long SelleridCounter = 0;
    private static long ItemidCounter = 0;

    public static synchronized long createSellerID()
    {
        return SelleridCounter++;
    }

    public static synchronized long createItemID()
    {
        return ItemidCounter++;
    }

    public void sellerLogin(sellerLoginRequest request,
                            io.grpc.stub.StreamObserver<sellerLoginResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);
        String response ="";

        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Seller(Long.parseLong(request.getUsername())));
        PaginatedQueryList<Seller> list = db.query(Seller.class, query);

        Iterator<Seller> iter = list.iterator();
        if (!iter.hasNext())
        {
            response = new StringBuilder().append("No seller found.. create account").toString();
        }
        else {
            Seller currentUser = iter.next();
            if(currentUser.isLoggedin())
                response = new StringBuilder().append("Already Logged in.").toString();
            else {
                if (currentUser.getPassword().equals(request.getPassword())) {
                    currentUser.setLoggedin(true);
                    db.save(currentUser);
                    response = new StringBuilder().append("Correct Password.. Logged in").toString();
                } else {
                    response = new StringBuilder().append("Wrong Password").toString();
                }
            }
        }
        sellerLoginResponse ans = sellerLoginResponse.newBuilder()
                .setLoginStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    public void createSellerAccount(createSellerAccountRequest request,
                                    io.grpc.stub.StreamObserver<createSellerAccountResponse> responseObserver) {

        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> query = new DynamoDBQueryExpression<>();
        DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
        PaginatedScanList<Seller> list = db.scan(Seller.class, scanExpression);
        Iterator<Seller> iter = list.iterator();
        String response="";
        boolean flag = false;
        while (iter.hasNext()) {
            Seller currentUser = iter.next();
            if (currentUser.getSellerName().equals(request.getUsername())) {
                response = new StringBuilder().append( "Already Created Account").toString();
                flag = true;
            }
        }
        if(!flag) {
            Long sellerId = createSellerID();
            Seller seller = new Seller(request.getUsername(), sellerId, new ArrayList<>(List.of(0, 0)), 0,
                    request.getPassword());
            db.save(seller);
            response = new StringBuilder().append("Seller Account Created with sellerId: " + String.valueOf(sellerId)).toString();
        }
        createSellerAccountResponse ans = createSellerAccountResponse.newBuilder()
                .setCreateAccountStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void logoutSeller(logoutSellerRequest request,
                             io.grpc.stub.StreamObserver<logoutSellerResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> list = db.query(Seller.class, query);
        String response="";
        boolean flag = false;
        Iterator<Seller> iter = list.iterator();
        while(iter.hasNext()) {
            Seller currentUser = iter.next();
            if(!currentUser.isLoggedin())
                response = new StringBuilder().append("Not logged in.. to logout").toString();
            else {
                currentUser.setLoggedin(false);
                db.save(currentUser);
                response = new StringBuilder().append("Logged out.. Log in back").toString();
                flag = true;
            }
        }
        if(!flag)
            response = new StringBuilder().append( "No user").toString();
        logoutSellerResponse ans = logoutSellerResponse.newBuilder()
                .setLogoutStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void sellerRating(sellerRatingRequest request,
                             io.grpc.stub.StreamObserver<sellerRatingResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> list = db.query(Seller.class, query);
        Iterator<Seller> iter = list.iterator();
        int rating = 0;
        String response="";
        boolean flag = false;
        if(!iter.hasNext()) {
            response = new StringBuilder().append( "No seller found.. create account").toString();
            flag = true;
        }
        else {
            Seller currentUser = iter.next();
            List<Integer> feedback = currentUser.getFeedback();
            if((feedback.get(0)+feedback.get(1))!=0)
                rating = (feedback.get(0)-feedback.get(1))/(feedback.get(0)+feedback.get(1));

        }
        if(!flag)
            response = new StringBuilder().append( "Seller Rating is: " + String.valueOf(rating)).toString();
        sellerRatingResponse ans = sellerRatingResponse.newBuilder()
                .setRatingStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }


    public void putItem(putItemRequest request,
                   io.grpc.stub.StreamObserver<putItemResponse> responseObserver) { //specify name in the query as well
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> queryUser = new DynamoDBQueryExpression<>();
        queryUser.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> listUser = db.query(Seller.class, queryUser);
        String response ="";
        Iterator<Seller> iterUser = listUser.iterator();
        boolean loginFlag = true;
        if(!iterUser.hasNext())
        {
            response = new StringBuilder().append("No user with given sellerId.").toString();
            loginFlag = false;
        }

        while (iterUser.hasNext()) {
            Seller currentUser = iterUser.next();
            if(!currentUser.isLoggedin())
            {
                response = new StringBuilder().append("Not logged in to perform the action").toString();
                loginFlag = false;
                break;
            }
        }

        if(loginFlag) {
            Long sellerId = request.getSellerId();
            Long itemId = createItemID();
            String itemName = request.getItemName();
            int itemCategory = request.getItemCategory();
            List<String> keywords = new ArrayList<>();
            for (int i = 3; i <= 7; i++) {
                keywords.add(request.getKeywords(i - 3));
            }
            boolean condition = request.getCondition();
            double salePrice = request.getSalePrice();
            int itemQuantity = request.getQuantity();
            Item currentItem = new Item(itemName, itemCategory, itemId, keywords, condition, salePrice, sellerId, itemQuantity);
            db.save(currentItem);
            response = new StringBuilder().append("placed Item for sale with ItemId: " + String.valueOf(itemId)).toString();
        }
        putItemResponse ans = putItemResponse.newBuilder()
                .setPutItemStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    public void updateItemSalePrice(updateItemSalePriceRequest request,
                                    io.grpc.stub.StreamObserver<updateItemSalePriceResponse> responseObserver) { //assuming same seller is doing the update
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> queryUser = new DynamoDBQueryExpression<>();
        queryUser.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> listUser = db.query(Seller.class, queryUser);
        String response ="";
        Iterator<Seller> iterUser = listUser.iterator();
        boolean loginFlag = true;
        if(!iterUser.hasNext())
        {
            response = new StringBuilder().append("No user with given sellerId.").toString();
            loginFlag = false;
        }

        while (iterUser.hasNext()) {
            Seller currentUser = iterUser.next();
            if(!currentUser.isLoggedin())
            {
                response = new StringBuilder().append("Not logged in to perform the action").toString();
                loginFlag = false;
                break;
            }
        }

        if(loginFlag) {
            DynamoDBQueryExpression<Item> query = new DynamoDBQueryExpression<>();
            query.setHashKeyValues(new Item(request.getItemId()));
            PaginatedQueryList<Item> list = db.query(Item.class, query);
            Iterator<Item> iter = list.iterator();

            if (!iter.hasNext()) response = "No item found with given ItemId";
            else {
                Item currentItem = iter.next();
                currentItem.setSalePrice(request.getNewSalePrice());
                db.save(currentItem);
                response = "Item price updated to: " + request.getNewSalePrice();
            }
        }
        updateItemSalePriceResponse ans = updateItemSalePriceResponse.newBuilder()
                .setUpdateItemSalePriceStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    public void removeItem(removeItemRequest request,
                           io.grpc.stub.StreamObserver<removeItemResponse> responseObserver) { //assuming same seller is doing the update
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> queryUser = new DynamoDBQueryExpression<>();
        queryUser.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> listUser = db.query(Seller.class, queryUser);
        String response ="";
        Iterator<Seller> iterUser = listUser.iterator();
        boolean loginFlag = true;
        if(!iterUser.hasNext())
        {
            response = new StringBuilder().append("No user with given sellerId.").toString();
            loginFlag = false;
        }

        while (iterUser.hasNext()) {
            Seller currentUser = iterUser.next();
            if(!currentUser.isLoggedin())
            {
                response = new StringBuilder().append("Not logged in to perform the action").toString();
                loginFlag = false;
                break;
            }
        }

        if(loginFlag) {
            DynamoDBQueryExpression<Item> query = new DynamoDBQueryExpression<>();
            query.setHashKeyValues(new Item(request.getItemId()));
            PaginatedQueryList<Item> list = db.query(Item.class, query);
            Iterator<Item> iter = list.iterator();

            if (!iter.hasNext()) response = "No item found with given ItemId";
            else {
                Item currentItem = iter.next();
                if (currentItem.getItemQuantity() <= request.getQuantity())
                    db.delete(currentItem);
                else {
                    currentItem.setItemQuantity(currentItem.getItemQuantity() - request.getQuantity());
                    db.save(currentItem);
                    response = request.getQuantity() + " quantities of Item with following ItemID: " + request.getItemId() + " are removed.";
                }
            }
        }
        removeItemResponse ans = removeItemResponse.newBuilder()
                .setRemoveItemStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();

    }

    public void displayItemsOnSale(displayItemsOnSaleRequest request,
                                   io.grpc.stub.StreamObserver<displayItemsOnSaleResponse> responseObserver) { //assuming same seller is doing the update
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> queryUser = new DynamoDBQueryExpression<>();
        queryUser.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> listUser = db.query(Seller.class, queryUser);
        StringBuilder response =new StringBuilder();
        Iterator<Seller> iterUser = listUser.iterator();
        boolean loginFlag = true;
        if(!iterUser.hasNext())
        {
            response = new StringBuilder(new StringBuilder().append("No user with given sellerId.").toString());
            loginFlag = false;
        }

        while (iterUser.hasNext()) {
            Seller currentUser = iterUser.next();
            if(!currentUser.isLoggedin())
            {
                response = new StringBuilder(new StringBuilder().append("Not logged in to perform the action").toString());
                loginFlag = false;
                break;
            }
        }

        if(loginFlag) {
            DynamoDBQueryExpression<Item> query = new DynamoDBQueryExpression<>();
            DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();

            PaginatedScanList<Item> list = db.scan(Item.class, scanExpression);

            Iterator<Item> iter = list.iterator();

            Long sellerId = request.getSellerId();
//        StringBuilder response = new StringBuilder();
            while (iter.hasNext()) {
                Item currentItem = iter.next();
                if (currentItem.getSellerId() == sellerId) {
                    response.append(currentItem.getItemName());
                    response.append(", ");
                }
            }
        }
        displayItemsOnSaleResponse ans = displayItemsOnSaleResponse.newBuilder()
                .setDisplayItemsOnSaleStatus(response.toString())
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

}
