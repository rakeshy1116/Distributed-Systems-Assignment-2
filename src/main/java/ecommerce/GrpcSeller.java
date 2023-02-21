package ecommerce;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcSeller {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8086)
                .addService(new GrpcSellerServer()).build();

        server.start();
        server.awaitTermination();
    }
}
