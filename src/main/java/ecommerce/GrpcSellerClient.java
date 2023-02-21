package ecommerce;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


import java.util.ArrayList;
import java.util.List;

public class GrpcSellerClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        ecommerce.SellerGrpc.SellerBlockingStub stub = ecommerce.SellerGrpc.newBlockingStub(channel);
//        TimeUnit.SECONDS.sleep(4);
        sellerLoginResponse loginResponse = stub.sellerLogin(sellerLoginRequest.newBuilder()
                .setUsername("0")
                .setPassword("hello123")
                .build());

        sellerRatingResponse ratingResponse = stub.sellerRating(sellerRatingRequest.newBuilder()
                .setSellerId(0)
                .build());
        createSellerAccountResponse accountResponse = stub.createSellerAccount(createSellerAccountRequest.newBuilder()
                .setUsername("rakesh")
                .setPassword("hello123")
                .build());
        logoutSellerResponse logoutResponse = stub.logoutSeller(logoutSellerRequest.newBuilder()
                .setSellerId(0)
                .build());

        List<String> keywords = new ArrayList<>();
        keywords.add("headphones");
        keywords.add("wireless");
        keywords.add("music");
        keywords.add("sound");
        keywords.add("songs");
        putItemResponse putItemRes = stub.putItem(putItemRequest.newBuilder()
                .setItemName("earphones")
                .setItemCategory(2)
                .addAllKeywords(keywords)
                .setCondition(true)
                .setSalePrice(105)
                .setSellerId(1)
                .setQuantity(5)
                .build());
//        6 0 110
//        7 1 1
//        8 1
        updateItemSalePriceResponse updateItemSalePriceResponse = stub.updateItemSalePrice(updateItemSalePriceRequest.newBuilder()
                .setItemId(0)
                .setNewSalePrice(110)
                .build());

        removeItemResponse removeItemResponse = stub.removeItem(removeItemRequest.newBuilder()
                .setItemId(1)
                .setQuantity(1)
                .build());

        displayItemsOnSaleResponse displayItemsOnSaleResponse = stub.displayItemsOnSale(displayItemsOnSaleRequest.newBuilder()
                .setSellerId(1)
                .build());


        System.out.println("Response received from server:\n" + loginResponse);
        System.out.println("Response received from server:\n" + ratingResponse);
        System.out.println("Response received from server:\n" + accountResponse);
        System.out.println("Response received from server:\n" + logoutResponse);
        System.out.println(putItemRes);
        System.out.println(updateItemSalePriceResponse);
        System.out.println(removeItemResponse);
        System.out.println(displayItemsOnSaleResponse);

        channel.shutdown();
    }
}