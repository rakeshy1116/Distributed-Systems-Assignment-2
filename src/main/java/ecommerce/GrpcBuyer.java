package ecommerce;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcBuyer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8085)
                .addService(new GrpcBuyerServer()).build();

        server.start();
        server.awaitTermination();
    }
}
