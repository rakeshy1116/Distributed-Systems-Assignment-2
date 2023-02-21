package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SellerNew.proto")
public final class SellerGrpc {

  private SellerGrpc() {}

  public static final String SERVICE_NAME = "Seller";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ecommerce.sellerLoginRequest,
      ecommerce.sellerLoginResponse> getSellerLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerLogin",
      requestType = ecommerce.sellerLoginRequest.class,
      responseType = ecommerce.sellerLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.sellerLoginRequest,
      ecommerce.sellerLoginResponse> getSellerLoginMethod() {
    io.grpc.MethodDescriptor<ecommerce.sellerLoginRequest, ecommerce.sellerLoginResponse> getSellerLoginMethod;
    if ((getSellerLoginMethod = SellerGrpc.getSellerLoginMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getSellerLoginMethod = SellerGrpc.getSellerLoginMethod) == null) {
          SellerGrpc.getSellerLoginMethod = getSellerLoginMethod =
              io.grpc.MethodDescriptor.<ecommerce.sellerLoginRequest, ecommerce.sellerLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.sellerLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.sellerLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("sellerLogin"))
              .build();
        }
      }
    }
    return getSellerLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.createSellerAccountRequest,
      ecommerce.createSellerAccountResponse> getCreateSellerAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSellerAccount",
      requestType = ecommerce.createSellerAccountRequest.class,
      responseType = ecommerce.createSellerAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.createSellerAccountRequest,
      ecommerce.createSellerAccountResponse> getCreateSellerAccountMethod() {
    io.grpc.MethodDescriptor<ecommerce.createSellerAccountRequest, ecommerce.createSellerAccountResponse> getCreateSellerAccountMethod;
    if ((getCreateSellerAccountMethod = SellerGrpc.getCreateSellerAccountMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getCreateSellerAccountMethod = SellerGrpc.getCreateSellerAccountMethod) == null) {
          SellerGrpc.getCreateSellerAccountMethod = getCreateSellerAccountMethod =
              io.grpc.MethodDescriptor.<ecommerce.createSellerAccountRequest, ecommerce.createSellerAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSellerAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.createSellerAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.createSellerAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("createSellerAccount"))
              .build();
        }
      }
    }
    return getCreateSellerAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.logoutSellerRequest,
      ecommerce.logoutSellerResponse> getLogoutSellerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logoutSeller",
      requestType = ecommerce.logoutSellerRequest.class,
      responseType = ecommerce.logoutSellerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.logoutSellerRequest,
      ecommerce.logoutSellerResponse> getLogoutSellerMethod() {
    io.grpc.MethodDescriptor<ecommerce.logoutSellerRequest, ecommerce.logoutSellerResponse> getLogoutSellerMethod;
    if ((getLogoutSellerMethod = SellerGrpc.getLogoutSellerMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getLogoutSellerMethod = SellerGrpc.getLogoutSellerMethod) == null) {
          SellerGrpc.getLogoutSellerMethod = getLogoutSellerMethod =
              io.grpc.MethodDescriptor.<ecommerce.logoutSellerRequest, ecommerce.logoutSellerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logoutSeller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.logoutSellerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.logoutSellerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("logoutSeller"))
              .build();
        }
      }
    }
    return getLogoutSellerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.sellerRatingRequest,
      ecommerce.sellerRatingResponse> getSellerRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerRating",
      requestType = ecommerce.sellerRatingRequest.class,
      responseType = ecommerce.sellerRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.sellerRatingRequest,
      ecommerce.sellerRatingResponse> getSellerRatingMethod() {
    io.grpc.MethodDescriptor<ecommerce.sellerRatingRequest, ecommerce.sellerRatingResponse> getSellerRatingMethod;
    if ((getSellerRatingMethod = SellerGrpc.getSellerRatingMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getSellerRatingMethod = SellerGrpc.getSellerRatingMethod) == null) {
          SellerGrpc.getSellerRatingMethod = getSellerRatingMethod =
              io.grpc.MethodDescriptor.<ecommerce.sellerRatingRequest, ecommerce.sellerRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.sellerRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.sellerRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("sellerRating"))
              .build();
        }
      }
    }
    return getSellerRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.putItemRequest,
      ecommerce.putItemResponse> getPutItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "putItem",
      requestType = ecommerce.putItemRequest.class,
      responseType = ecommerce.putItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.putItemRequest,
      ecommerce.putItemResponse> getPutItemMethod() {
    io.grpc.MethodDescriptor<ecommerce.putItemRequest, ecommerce.putItemResponse> getPutItemMethod;
    if ((getPutItemMethod = SellerGrpc.getPutItemMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getPutItemMethod = SellerGrpc.getPutItemMethod) == null) {
          SellerGrpc.getPutItemMethod = getPutItemMethod =
              io.grpc.MethodDescriptor.<ecommerce.putItemRequest, ecommerce.putItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "putItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.putItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.putItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("putItem"))
              .build();
        }
      }
    }
    return getPutItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.updateItemSalePriceRequest,
      ecommerce.updateItemSalePriceResponse> getUpdateItemSalePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateItemSalePrice",
      requestType = ecommerce.updateItemSalePriceRequest.class,
      responseType = ecommerce.updateItemSalePriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.updateItemSalePriceRequest,
      ecommerce.updateItemSalePriceResponse> getUpdateItemSalePriceMethod() {
    io.grpc.MethodDescriptor<ecommerce.updateItemSalePriceRequest, ecommerce.updateItemSalePriceResponse> getUpdateItemSalePriceMethod;
    if ((getUpdateItemSalePriceMethod = SellerGrpc.getUpdateItemSalePriceMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getUpdateItemSalePriceMethod = SellerGrpc.getUpdateItemSalePriceMethod) == null) {
          SellerGrpc.getUpdateItemSalePriceMethod = getUpdateItemSalePriceMethod =
              io.grpc.MethodDescriptor.<ecommerce.updateItemSalePriceRequest, ecommerce.updateItemSalePriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateItemSalePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.updateItemSalePriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.updateItemSalePriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("updateItemSalePrice"))
              .build();
        }
      }
    }
    return getUpdateItemSalePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.removeItemRequest,
      ecommerce.removeItemResponse> getRemoveItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeItem",
      requestType = ecommerce.removeItemRequest.class,
      responseType = ecommerce.removeItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.removeItemRequest,
      ecommerce.removeItemResponse> getRemoveItemMethod() {
    io.grpc.MethodDescriptor<ecommerce.removeItemRequest, ecommerce.removeItemResponse> getRemoveItemMethod;
    if ((getRemoveItemMethod = SellerGrpc.getRemoveItemMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getRemoveItemMethod = SellerGrpc.getRemoveItemMethod) == null) {
          SellerGrpc.getRemoveItemMethod = getRemoveItemMethod =
              io.grpc.MethodDescriptor.<ecommerce.removeItemRequest, ecommerce.removeItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.removeItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.removeItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("removeItem"))
              .build();
        }
      }
    }
    return getRemoveItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.displayItemsOnSaleRequest,
      ecommerce.displayItemsOnSaleResponse> getDisplayItemsOnSaleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayItemsOnSale",
      requestType = ecommerce.displayItemsOnSaleRequest.class,
      responseType = ecommerce.displayItemsOnSaleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.displayItemsOnSaleRequest,
      ecommerce.displayItemsOnSaleResponse> getDisplayItemsOnSaleMethod() {
    io.grpc.MethodDescriptor<ecommerce.displayItemsOnSaleRequest, ecommerce.displayItemsOnSaleResponse> getDisplayItemsOnSaleMethod;
    if ((getDisplayItemsOnSaleMethod = SellerGrpc.getDisplayItemsOnSaleMethod) == null) {
      synchronized (SellerGrpc.class) {
        if ((getDisplayItemsOnSaleMethod = SellerGrpc.getDisplayItemsOnSaleMethod) == null) {
          SellerGrpc.getDisplayItemsOnSaleMethod = getDisplayItemsOnSaleMethod =
              io.grpc.MethodDescriptor.<ecommerce.displayItemsOnSaleRequest, ecommerce.displayItemsOnSaleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "displayItemsOnSale"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.displayItemsOnSaleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.displayItemsOnSaleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerMethodDescriptorSupplier("displayItemsOnSale"))
              .build();
        }
      }
    }
    return getDisplayItemsOnSaleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SellerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerStub>() {
        @Override
        public SellerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerStub(channel, callOptions);
        }
      };
    return SellerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SellerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerBlockingStub>() {
        @Override
        public SellerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerBlockingStub(channel, callOptions);
        }
      };
    return SellerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SellerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerFutureStub>() {
        @Override
        public SellerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerFutureStub(channel, callOptions);
        }
      };
    return SellerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SellerImplBase implements io.grpc.BindableService {

    /**
     */
    public void sellerLogin(ecommerce.sellerLoginRequest request,
        io.grpc.stub.StreamObserver<ecommerce.sellerLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerLoginMethod(), responseObserver);
    }

    /**
     */
    public void createSellerAccount(ecommerce.createSellerAccountRequest request,
        io.grpc.stub.StreamObserver<ecommerce.createSellerAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSellerAccountMethod(), responseObserver);
    }

    /**
     */
    public void logoutSeller(ecommerce.logoutSellerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.logoutSellerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutSellerMethod(), responseObserver);
    }

    /**
     */
    public void sellerRating(ecommerce.sellerRatingRequest request,
        io.grpc.stub.StreamObserver<ecommerce.sellerRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerRatingMethod(), responseObserver);
    }

    /**
     */
    public void putItem(ecommerce.putItemRequest request,
        io.grpc.stub.StreamObserver<ecommerce.putItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutItemMethod(), responseObserver);
    }

    /**
     */
    public void updateItemSalePrice(ecommerce.updateItemSalePriceRequest request,
        io.grpc.stub.StreamObserver<ecommerce.updateItemSalePriceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemSalePriceMethod(), responseObserver);
    }

    /**
     */
    public void removeItem(ecommerce.removeItemRequest request,
        io.grpc.stub.StreamObserver<ecommerce.removeItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveItemMethod(), responseObserver);
    }

    /**
     */
    public void displayItemsOnSale(ecommerce.displayItemsOnSaleRequest request,
        io.grpc.stub.StreamObserver<ecommerce.displayItemsOnSaleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisplayItemsOnSaleMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSellerLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.sellerLoginRequest,
                ecommerce.sellerLoginResponse>(
                  this, METHODID_SELLER_LOGIN)))
          .addMethod(
            getCreateSellerAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.createSellerAccountRequest,
                ecommerce.createSellerAccountResponse>(
                  this, METHODID_CREATE_SELLER_ACCOUNT)))
          .addMethod(
            getLogoutSellerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.logoutSellerRequest,
                ecommerce.logoutSellerResponse>(
                  this, METHODID_LOGOUT_SELLER)))
          .addMethod(
            getSellerRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.sellerRatingRequest,
                ecommerce.sellerRatingResponse>(
                  this, METHODID_SELLER_RATING)))
          .addMethod(
            getPutItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.putItemRequest,
                ecommerce.putItemResponse>(
                  this, METHODID_PUT_ITEM)))
          .addMethod(
            getUpdateItemSalePriceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.updateItemSalePriceRequest,
                ecommerce.updateItemSalePriceResponse>(
                  this, METHODID_UPDATE_ITEM_SALE_PRICE)))
          .addMethod(
            getRemoveItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.removeItemRequest,
                ecommerce.removeItemResponse>(
                  this, METHODID_REMOVE_ITEM)))
          .addMethod(
            getDisplayItemsOnSaleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.displayItemsOnSaleRequest,
                ecommerce.displayItemsOnSaleResponse>(
                  this, METHODID_DISPLAY_ITEMS_ON_SALE)))
          .build();
    }
  }

  /**
   */
  public static final class SellerStub extends io.grpc.stub.AbstractAsyncStub<SellerStub> {
    private SellerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SellerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerStub(channel, callOptions);
    }

    /**
     */
    public void sellerLogin(ecommerce.sellerLoginRequest request,
        io.grpc.stub.StreamObserver<ecommerce.sellerLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSellerAccount(ecommerce.createSellerAccountRequest request,
        io.grpc.stub.StreamObserver<ecommerce.createSellerAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSellerAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logoutSeller(ecommerce.logoutSellerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.logoutSellerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutSellerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellerRating(ecommerce.sellerRatingRequest request,
        io.grpc.stub.StreamObserver<ecommerce.sellerRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putItem(ecommerce.putItemRequest request,
        io.grpc.stub.StreamObserver<ecommerce.putItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateItemSalePrice(ecommerce.updateItemSalePriceRequest request,
        io.grpc.stub.StreamObserver<ecommerce.updateItemSalePriceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemSalePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeItem(ecommerce.removeItemRequest request,
        io.grpc.stub.StreamObserver<ecommerce.removeItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void displayItemsOnSale(ecommerce.displayItemsOnSaleRequest request,
        io.grpc.stub.StreamObserver<ecommerce.displayItemsOnSaleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisplayItemsOnSaleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SellerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SellerBlockingStub> {
    private SellerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SellerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerBlockingStub(channel, callOptions);
    }

    /**
     */
    public ecommerce.sellerLoginResponse sellerLogin(ecommerce.sellerLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.createSellerAccountResponse createSellerAccount(ecommerce.createSellerAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSellerAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.logoutSellerResponse logoutSeller(ecommerce.logoutSellerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutSellerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.sellerRatingResponse sellerRating(ecommerce.sellerRatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.putItemResponse putItem(ecommerce.putItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.updateItemSalePriceResponse updateItemSalePrice(ecommerce.updateItemSalePriceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemSalePriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.removeItemResponse removeItem(ecommerce.removeItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.displayItemsOnSaleResponse displayItemsOnSale(ecommerce.displayItemsOnSaleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisplayItemsOnSaleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SellerFutureStub extends io.grpc.stub.AbstractFutureStub<SellerFutureStub> {
    private SellerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SellerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.sellerLoginResponse> sellerLogin(
        ecommerce.sellerLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.createSellerAccountResponse> createSellerAccount(
        ecommerce.createSellerAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSellerAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.logoutSellerResponse> logoutSeller(
        ecommerce.logoutSellerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutSellerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.sellerRatingResponse> sellerRating(
        ecommerce.sellerRatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.putItemResponse> putItem(
        ecommerce.putItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.updateItemSalePriceResponse> updateItemSalePrice(
        ecommerce.updateItemSalePriceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemSalePriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.removeItemResponse> removeItem(
        ecommerce.removeItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveItemMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.displayItemsOnSaleResponse> displayItemsOnSale(
        ecommerce.displayItemsOnSaleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisplayItemsOnSaleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SELLER_LOGIN = 0;
  private static final int METHODID_CREATE_SELLER_ACCOUNT = 1;
  private static final int METHODID_LOGOUT_SELLER = 2;
  private static final int METHODID_SELLER_RATING = 3;
  private static final int METHODID_PUT_ITEM = 4;
  private static final int METHODID_UPDATE_ITEM_SALE_PRICE = 5;
  private static final int METHODID_REMOVE_ITEM = 6;
  private static final int METHODID_DISPLAY_ITEMS_ON_SALE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SellerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SellerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELLER_LOGIN:
          serviceImpl.sellerLogin((ecommerce.sellerLoginRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.sellerLoginResponse>) responseObserver);
          break;
        case METHODID_CREATE_SELLER_ACCOUNT:
          serviceImpl.createSellerAccount((ecommerce.createSellerAccountRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.createSellerAccountResponse>) responseObserver);
          break;
        case METHODID_LOGOUT_SELLER:
          serviceImpl.logoutSeller((ecommerce.logoutSellerRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.logoutSellerResponse>) responseObserver);
          break;
        case METHODID_SELLER_RATING:
          serviceImpl.sellerRating((ecommerce.sellerRatingRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.sellerRatingResponse>) responseObserver);
          break;
        case METHODID_PUT_ITEM:
          serviceImpl.putItem((ecommerce.putItemRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.putItemResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM_SALE_PRICE:
          serviceImpl.updateItemSalePrice((ecommerce.updateItemSalePriceRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.updateItemSalePriceResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ITEM:
          serviceImpl.removeItem((ecommerce.removeItemRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.removeItemResponse>) responseObserver);
          break;
        case METHODID_DISPLAY_ITEMS_ON_SALE:
          serviceImpl.displayItemsOnSale((ecommerce.displayItemsOnSaleRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.displayItemsOnSaleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SellerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SellerBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ecommerce.SellerNew.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Seller");
    }
  }

  private static final class SellerFileDescriptorSupplier
      extends SellerBaseDescriptorSupplier {
    SellerFileDescriptorSupplier() {}
  }

  private static final class SellerMethodDescriptorSupplier
      extends SellerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SellerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SellerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SellerFileDescriptorSupplier())
              .addMethod(getSellerLoginMethod())
              .addMethod(getCreateSellerAccountMethod())
              .addMethod(getLogoutSellerMethod())
              .addMethod(getSellerRatingMethod())
              .addMethod(getPutItemMethod())
              .addMethod(getUpdateItemSalePriceMethod())
              .addMethod(getRemoveItemMethod())
              .addMethod(getDisplayItemsOnSaleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
