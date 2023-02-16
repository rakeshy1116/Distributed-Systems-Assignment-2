package ecommerce;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.util.concurrent.TimeUnit;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        SellerGGrpc.SellerGBlockingStub stub = SellerGGrpc.newBlockingStub(channel);
//        TimeUnit.SECONDS.sleep(4);
        SLoginResponse loginResponse = stub.sellerLogin(SLoginRequest.newBuilder()
                .setUsername("0")
                .setPassword("hello123")
                .build());

        SRatingResponse ratingResponse = stub.sellerRating(SRatingRequest.newBuilder()
                .setSellerId(0)
                .build());
        SCreateAccountResponse accountResponse = stub.createSellerAccount(SCreateAccountRequest.newBuilder()
                .setUsername("rakesh")
                .setPassword("hello123")
                .build());
        SLogoutResponse logoutResponse = stub.logoutSeller(SLogoutRequest.newBuilder()
                .setSellerId(0)
                .build());

        System.out.println("Response received from server:\n" + loginResponse);
        System.out.println("Response received from server:\n" + ratingResponse);
        System.out.println("Response received from server:\n" + accountResponse);
        System.out.println("Response received from server:\n" + logoutResponse);

        channel.shutdown();
    }
}