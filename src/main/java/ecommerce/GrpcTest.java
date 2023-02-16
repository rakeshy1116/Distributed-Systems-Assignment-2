package ecommerce;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GrpcTest extends SellerGGrpc.SellerGImplBase{

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

    public void sellerLogin(ecommerce.SLoginRequest request,
                            io.grpc.stub.StreamObserver<ecommerce.SLoginResponse> responseObserver) {
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
            if(currentUser.getPassword().equals(request.getPassword())){
                currentUser.setLoggedin(true);
                db.save(currentUser);
                response = new StringBuilder().append("Correct Password.. Logged in").toString();
            }
            else {
                response = new StringBuilder().append("Wrong Password").toString();
            }
        }
        SLoginResponse ans = SLoginResponse.newBuilder()
                .setLoginStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    public void createSellerAccount(SCreateAccountRequest request,
                                    io.grpc.stub.StreamObserver<SCreateAccountResponse> responseObserver) {

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
        SCreateAccountResponse ans = SCreateAccountResponse.newBuilder()
                .setCreateAccountStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void logoutSeller(SLogoutRequest request,
                             io.grpc.stub.StreamObserver<SLogoutResponse> responseObserver) {
        DynamoDBMapper db = DynamoDBSample.getInstance().getMapper();
        DynamoDBQueryExpression<Seller> query = new DynamoDBQueryExpression<>();
        query.setHashKeyValues(new Seller(request.getSellerId()));
        PaginatedQueryList<Seller> list = db.query(Seller.class, query);
        String response="";
        boolean flag = false;
        Iterator<Seller> iter = list.iterator();
        while(iter.hasNext()) {
            Seller currentUser = iter.next();
            currentUser.setLoggedin(false);
            db.save(currentUser);
            response = new StringBuilder().append( "Logged out.. Log in back").toString();
            flag = true;
        }
        if(!flag)
            response = new StringBuilder().append( "No user").toString();
        SLogoutResponse ans = SLogoutResponse.newBuilder()
                .setLogoutStatus(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }

    /**
     */
    public void sellerRating(SRatingRequest request,
                             io.grpc.stub.StreamObserver<SRatingResponse> responseObserver) {
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
        SRatingResponse ans = SRatingResponse.newBuilder()
                .setRating(response)
                .build();

        responseObserver.onNext(ans);
        responseObserver.onCompleted();
    }
}
