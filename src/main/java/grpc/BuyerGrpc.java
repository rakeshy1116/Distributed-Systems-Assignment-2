package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Buyer.proto")
public final class BuyerGrpc {

  private BuyerGrpc() {}

  public static final String SERVICE_NAME = "Buyer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ecommerce.loginBuyerRequest,
      ecommerce.loginBuyerResponse> getLoginBuyerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "loginBuyer",
      requestType = ecommerce.loginBuyerRequest.class,
      responseType = ecommerce.loginBuyerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.loginBuyerRequest,
      ecommerce.loginBuyerResponse> getLoginBuyerMethod() {
    io.grpc.MethodDescriptor<ecommerce.loginBuyerRequest, ecommerce.loginBuyerResponse> getLoginBuyerMethod;
    if ((getLoginBuyerMethod = BuyerGrpc.getLoginBuyerMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getLoginBuyerMethod = BuyerGrpc.getLoginBuyerMethod) == null) {
          BuyerGrpc.getLoginBuyerMethod = getLoginBuyerMethod =
              io.grpc.MethodDescriptor.<ecommerce.loginBuyerRequest, ecommerce.loginBuyerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "loginBuyer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.loginBuyerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.loginBuyerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("loginBuyer"))
              .build();
        }
      }
    }
    return getLoginBuyerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.createBuyerAccountRequest,
      ecommerce.createBuyerAccountResponse> getCreateBuyerAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createBuyerAccount",
      requestType = ecommerce.createBuyerAccountRequest.class,
      responseType = ecommerce.createBuyerAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.createBuyerAccountRequest,
      ecommerce.createBuyerAccountResponse> getCreateBuyerAccountMethod() {
    io.grpc.MethodDescriptor<ecommerce.createBuyerAccountRequest, ecommerce.createBuyerAccountResponse> getCreateBuyerAccountMethod;
    if ((getCreateBuyerAccountMethod = BuyerGrpc.getCreateBuyerAccountMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getCreateBuyerAccountMethod = BuyerGrpc.getCreateBuyerAccountMethod) == null) {
          BuyerGrpc.getCreateBuyerAccountMethod = getCreateBuyerAccountMethod =
              io.grpc.MethodDescriptor.<ecommerce.createBuyerAccountRequest, ecommerce.createBuyerAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createBuyerAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.createBuyerAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.createBuyerAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("createBuyerAccount"))
              .build();
        }
      }
    }
    return getCreateBuyerAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.logoutBuyerRequest,
      ecommerce.logoutBuyerResponse> getLogoutBuyerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logoutBuyer",
      requestType = ecommerce.logoutBuyerRequest.class,
      responseType = ecommerce.logoutBuyerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.logoutBuyerRequest,
      ecommerce.logoutBuyerResponse> getLogoutBuyerMethod() {
    io.grpc.MethodDescriptor<ecommerce.logoutBuyerRequest, ecommerce.logoutBuyerResponse> getLogoutBuyerMethod;
    if ((getLogoutBuyerMethod = BuyerGrpc.getLogoutBuyerMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getLogoutBuyerMethod = BuyerGrpc.getLogoutBuyerMethod) == null) {
          BuyerGrpc.getLogoutBuyerMethod = getLogoutBuyerMethod =
              io.grpc.MethodDescriptor.<ecommerce.logoutBuyerRequest, ecommerce.logoutBuyerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logoutBuyer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.logoutBuyerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.logoutBuyerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("logoutBuyer"))
              .build();
        }
      }
    }
    return getLogoutBuyerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.addToShoppingCartRequest,
      ecommerce.addToShoppingCartResponse> getAddToShoppingCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addToShoppingCart",
      requestType = ecommerce.addToShoppingCartRequest.class,
      responseType = ecommerce.addToShoppingCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.addToShoppingCartRequest,
      ecommerce.addToShoppingCartResponse> getAddToShoppingCartMethod() {
    io.grpc.MethodDescriptor<ecommerce.addToShoppingCartRequest, ecommerce.addToShoppingCartResponse> getAddToShoppingCartMethod;
    if ((getAddToShoppingCartMethod = BuyerGrpc.getAddToShoppingCartMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getAddToShoppingCartMethod = BuyerGrpc.getAddToShoppingCartMethod) == null) {
          BuyerGrpc.getAddToShoppingCartMethod = getAddToShoppingCartMethod =
              io.grpc.MethodDescriptor.<ecommerce.addToShoppingCartRequest, ecommerce.addToShoppingCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addToShoppingCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.addToShoppingCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.addToShoppingCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("addToShoppingCart"))
              .build();
        }
      }
    }
    return getAddToShoppingCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.removeFromShoppingCartRequest,
      ecommerce.removeFromShoppingCartResponse> getRemoveFromShoppingCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeFromShoppingCart",
      requestType = ecommerce.removeFromShoppingCartRequest.class,
      responseType = ecommerce.removeFromShoppingCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.removeFromShoppingCartRequest,
      ecommerce.removeFromShoppingCartResponse> getRemoveFromShoppingCartMethod() {
    io.grpc.MethodDescriptor<ecommerce.removeFromShoppingCartRequest, ecommerce.removeFromShoppingCartResponse> getRemoveFromShoppingCartMethod;
    if ((getRemoveFromShoppingCartMethod = BuyerGrpc.getRemoveFromShoppingCartMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getRemoveFromShoppingCartMethod = BuyerGrpc.getRemoveFromShoppingCartMethod) == null) {
          BuyerGrpc.getRemoveFromShoppingCartMethod = getRemoveFromShoppingCartMethod =
              io.grpc.MethodDescriptor.<ecommerce.removeFromShoppingCartRequest, ecommerce.removeFromShoppingCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeFromShoppingCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.removeFromShoppingCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.removeFromShoppingCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("removeFromShoppingCart"))
              .build();
        }
      }
    }
    return getRemoveFromShoppingCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.clearShoppingCartRequest,
      ecommerce.clearShoppingCartResponse> getClearShoppingCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearShoppingCart",
      requestType = ecommerce.clearShoppingCartRequest.class,
      responseType = ecommerce.clearShoppingCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.clearShoppingCartRequest,
      ecommerce.clearShoppingCartResponse> getClearShoppingCartMethod() {
    io.grpc.MethodDescriptor<ecommerce.clearShoppingCartRequest, ecommerce.clearShoppingCartResponse> getClearShoppingCartMethod;
    if ((getClearShoppingCartMethod = BuyerGrpc.getClearShoppingCartMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getClearShoppingCartMethod = BuyerGrpc.getClearShoppingCartMethod) == null) {
          BuyerGrpc.getClearShoppingCartMethod = getClearShoppingCartMethod =
              io.grpc.MethodDescriptor.<ecommerce.clearShoppingCartRequest, ecommerce.clearShoppingCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clearShoppingCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.clearShoppingCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.clearShoppingCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("clearShoppingCart"))
              .build();
        }
      }
    }
    return getClearShoppingCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.displayShoppingCartRequest,
      ecommerce.displayShoppingCartResponse> getDisplayShoppingCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "displayShoppingCart",
      requestType = ecommerce.displayShoppingCartRequest.class,
      responseType = ecommerce.displayShoppingCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.displayShoppingCartRequest,
      ecommerce.displayShoppingCartResponse> getDisplayShoppingCartMethod() {
    io.grpc.MethodDescriptor<ecommerce.displayShoppingCartRequest, ecommerce.displayShoppingCartResponse> getDisplayShoppingCartMethod;
    if ((getDisplayShoppingCartMethod = BuyerGrpc.getDisplayShoppingCartMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getDisplayShoppingCartMethod = BuyerGrpc.getDisplayShoppingCartMethod) == null) {
          BuyerGrpc.getDisplayShoppingCartMethod = getDisplayShoppingCartMethod =
              io.grpc.MethodDescriptor.<ecommerce.displayShoppingCartRequest, ecommerce.displayShoppingCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "displayShoppingCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.displayShoppingCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.displayShoppingCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("displayShoppingCart"))
              .build();
        }
      }
    }
    return getDisplayShoppingCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.sellerRatingByBuyerRequest,
      ecommerce.sellerRatingByBuyerResponse> getSellerRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerRating",
      requestType = ecommerce.sellerRatingByBuyerRequest.class,
      responseType = ecommerce.sellerRatingByBuyerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.sellerRatingByBuyerRequest,
      ecommerce.sellerRatingByBuyerResponse> getSellerRatingMethod() {
    io.grpc.MethodDescriptor<ecommerce.sellerRatingByBuyerRequest, ecommerce.sellerRatingByBuyerResponse> getSellerRatingMethod;
    if ((getSellerRatingMethod = BuyerGrpc.getSellerRatingMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getSellerRatingMethod = BuyerGrpc.getSellerRatingMethod) == null) {
          BuyerGrpc.getSellerRatingMethod = getSellerRatingMethod =
              io.grpc.MethodDescriptor.<ecommerce.sellerRatingByBuyerRequest, ecommerce.sellerRatingByBuyerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.sellerRatingByBuyerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.sellerRatingByBuyerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("sellerRating"))
              .build();
        }
      }
    }
    return getSellerRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.feedBackSellerRequest,
      ecommerce.feedBackSellerResponse> getFeedBackSellerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "feedBackSeller",
      requestType = ecommerce.feedBackSellerRequest.class,
      responseType = ecommerce.feedBackSellerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.feedBackSellerRequest,
      ecommerce.feedBackSellerResponse> getFeedBackSellerMethod() {
    io.grpc.MethodDescriptor<ecommerce.feedBackSellerRequest, ecommerce.feedBackSellerResponse> getFeedBackSellerMethod;
    if ((getFeedBackSellerMethod = BuyerGrpc.getFeedBackSellerMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getFeedBackSellerMethod = BuyerGrpc.getFeedBackSellerMethod) == null) {
          BuyerGrpc.getFeedBackSellerMethod = getFeedBackSellerMethod =
              io.grpc.MethodDescriptor.<ecommerce.feedBackSellerRequest, ecommerce.feedBackSellerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "feedBackSeller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.feedBackSellerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.feedBackSellerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("feedBackSeller"))
              .build();
        }
      }
    }
    return getFeedBackSellerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.purchaseHistoryRequest,
      ecommerce.purchaseHistoryResponse> getPurchaseHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "purchaseHistory",
      requestType = ecommerce.purchaseHistoryRequest.class,
      responseType = ecommerce.purchaseHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.purchaseHistoryRequest,
      ecommerce.purchaseHistoryResponse> getPurchaseHistoryMethod() {
    io.grpc.MethodDescriptor<ecommerce.purchaseHistoryRequest, ecommerce.purchaseHistoryResponse> getPurchaseHistoryMethod;
    if ((getPurchaseHistoryMethod = BuyerGrpc.getPurchaseHistoryMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getPurchaseHistoryMethod = BuyerGrpc.getPurchaseHistoryMethod) == null) {
          BuyerGrpc.getPurchaseHistoryMethod = getPurchaseHistoryMethod =
              io.grpc.MethodDescriptor.<ecommerce.purchaseHistoryRequest, ecommerce.purchaseHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "purchaseHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.purchaseHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.purchaseHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("purchaseHistory"))
              .build();
        }
      }
    }
    return getPurchaseHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.makePurchaseRequest,
      ecommerce.makePurchaseResponse> getMakePurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makePurchase",
      requestType = ecommerce.makePurchaseRequest.class,
      responseType = ecommerce.makePurchaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.makePurchaseRequest,
      ecommerce.makePurchaseResponse> getMakePurchaseMethod() {
    io.grpc.MethodDescriptor<ecommerce.makePurchaseRequest, ecommerce.makePurchaseResponse> getMakePurchaseMethod;
    if ((getMakePurchaseMethod = BuyerGrpc.getMakePurchaseMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getMakePurchaseMethod = BuyerGrpc.getMakePurchaseMethod) == null) {
          BuyerGrpc.getMakePurchaseMethod = getMakePurchaseMethod =
              io.grpc.MethodDescriptor.<ecommerce.makePurchaseRequest, ecommerce.makePurchaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "makePurchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.makePurchaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.makePurchaseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("makePurchase"))
              .build();
        }
      }
    }
    return getMakePurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.searchItemsRequest,
      ecommerce.searchItemsResponse> getSearchItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchItems",
      requestType = ecommerce.searchItemsRequest.class,
      responseType = ecommerce.searchItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.searchItemsRequest,
      ecommerce.searchItemsResponse> getSearchItemsMethod() {
    io.grpc.MethodDescriptor<ecommerce.searchItemsRequest, ecommerce.searchItemsResponse> getSearchItemsMethod;
    if ((getSearchItemsMethod = BuyerGrpc.getSearchItemsMethod) == null) {
      synchronized (BuyerGrpc.class) {
        if ((getSearchItemsMethod = BuyerGrpc.getSearchItemsMethod) == null) {
          BuyerGrpc.getSearchItemsMethod = getSearchItemsMethod =
              io.grpc.MethodDescriptor.<ecommerce.searchItemsRequest, ecommerce.searchItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.searchItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.searchItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BuyerMethodDescriptorSupplier("searchItems"))
              .build();
        }
      }
    }
    return getSearchItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuyerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuyerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuyerStub>() {
        @Override
        public BuyerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuyerStub(channel, callOptions);
        }
      };
    return BuyerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuyerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuyerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuyerBlockingStub>() {
        @Override
        public BuyerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuyerBlockingStub(channel, callOptions);
        }
      };
    return BuyerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuyerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BuyerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BuyerFutureStub>() {
        @Override
        public BuyerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BuyerFutureStub(channel, callOptions);
        }
      };
    return BuyerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BuyerImplBase implements io.grpc.BindableService {

    /**
     */
    public void loginBuyer(ecommerce.loginBuyerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.loginBuyerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginBuyerMethod(), responseObserver);
    }

    /**
     */
    public void createBuyerAccount(ecommerce.createBuyerAccountRequest request,
        io.grpc.stub.StreamObserver<ecommerce.createBuyerAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBuyerAccountMethod(), responseObserver);
    }

    /**
     */
    public void logoutBuyer(ecommerce.logoutBuyerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.logoutBuyerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutBuyerMethod(), responseObserver);
    }

    /**
     */
    public void addToShoppingCart(ecommerce.addToShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.addToShoppingCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToShoppingCartMethod(), responseObserver);
    }

    /**
     */
    public void removeFromShoppingCart(ecommerce.removeFromShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.removeFromShoppingCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFromShoppingCartMethod(), responseObserver);
    }

    /**
     */
    public void clearShoppingCart(ecommerce.clearShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.clearShoppingCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearShoppingCartMethod(), responseObserver);
    }

    /**
     */
    public void displayShoppingCart(ecommerce.displayShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.displayShoppingCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisplayShoppingCartMethod(), responseObserver);
    }

    /**
     */
    public void sellerRating(ecommerce.sellerRatingByBuyerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.sellerRatingByBuyerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerRatingMethod(), responseObserver);
    }

    /**
     */
    public void feedBackSeller(ecommerce.feedBackSellerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.feedBackSellerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFeedBackSellerMethod(), responseObserver);
    }

    /**
     */
    public void purchaseHistory(ecommerce.purchaseHistoryRequest request,
        io.grpc.stub.StreamObserver<ecommerce.purchaseHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPurchaseHistoryMethod(), responseObserver);
    }

    /**
     */
    public void makePurchase(ecommerce.makePurchaseRequest request,
        io.grpc.stub.StreamObserver<ecommerce.makePurchaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMakePurchaseMethod(), responseObserver);
    }

    /**
     */
    public void searchItems(ecommerce.searchItemsRequest request,
        io.grpc.stub.StreamObserver<ecommerce.searchItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchItemsMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginBuyerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.loginBuyerRequest,
                ecommerce.loginBuyerResponse>(
                  this, METHODID_LOGIN_BUYER)))
          .addMethod(
            getCreateBuyerAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.createBuyerAccountRequest,
                ecommerce.createBuyerAccountResponse>(
                  this, METHODID_CREATE_BUYER_ACCOUNT)))
          .addMethod(
            getLogoutBuyerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.logoutBuyerRequest,
                ecommerce.logoutBuyerResponse>(
                  this, METHODID_LOGOUT_BUYER)))
          .addMethod(
            getAddToShoppingCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.addToShoppingCartRequest,
                ecommerce.addToShoppingCartResponse>(
                  this, METHODID_ADD_TO_SHOPPING_CART)))
          .addMethod(
            getRemoveFromShoppingCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.removeFromShoppingCartRequest,
                ecommerce.removeFromShoppingCartResponse>(
                  this, METHODID_REMOVE_FROM_SHOPPING_CART)))
          .addMethod(
            getClearShoppingCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.clearShoppingCartRequest,
                ecommerce.clearShoppingCartResponse>(
                  this, METHODID_CLEAR_SHOPPING_CART)))
          .addMethod(
            getDisplayShoppingCartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.displayShoppingCartRequest,
                ecommerce.displayShoppingCartResponse>(
                  this, METHODID_DISPLAY_SHOPPING_CART)))
          .addMethod(
            getSellerRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.sellerRatingByBuyerRequest,
                ecommerce.sellerRatingByBuyerResponse>(
                  this, METHODID_SELLER_RATING)))
          .addMethod(
            getFeedBackSellerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.feedBackSellerRequest,
                ecommerce.feedBackSellerResponse>(
                  this, METHODID_FEED_BACK_SELLER)))
          .addMethod(
            getPurchaseHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.purchaseHistoryRequest,
                ecommerce.purchaseHistoryResponse>(
                  this, METHODID_PURCHASE_HISTORY)))
          .addMethod(
            getMakePurchaseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.makePurchaseRequest,
                ecommerce.makePurchaseResponse>(
                  this, METHODID_MAKE_PURCHASE)))
          .addMethod(
            getSearchItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.searchItemsRequest,
                ecommerce.searchItemsResponse>(
                  this, METHODID_SEARCH_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class BuyerStub extends io.grpc.stub.AbstractAsyncStub<BuyerStub> {
    private BuyerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BuyerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuyerStub(channel, callOptions);
    }

    /**
     */
    public void loginBuyer(ecommerce.loginBuyerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.loginBuyerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginBuyerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBuyerAccount(ecommerce.createBuyerAccountRequest request,
        io.grpc.stub.StreamObserver<ecommerce.createBuyerAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBuyerAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logoutBuyer(ecommerce.logoutBuyerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.logoutBuyerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutBuyerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addToShoppingCart(ecommerce.addToShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.addToShoppingCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToShoppingCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeFromShoppingCart(ecommerce.removeFromShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.removeFromShoppingCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFromShoppingCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearShoppingCart(ecommerce.clearShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.clearShoppingCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearShoppingCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void displayShoppingCart(ecommerce.displayShoppingCartRequest request,
        io.grpc.stub.StreamObserver<ecommerce.displayShoppingCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisplayShoppingCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellerRating(ecommerce.sellerRatingByBuyerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.sellerRatingByBuyerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void feedBackSeller(ecommerce.feedBackSellerRequest request,
        io.grpc.stub.StreamObserver<ecommerce.feedBackSellerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFeedBackSellerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchaseHistory(ecommerce.purchaseHistoryRequest request,
        io.grpc.stub.StreamObserver<ecommerce.purchaseHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPurchaseHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makePurchase(ecommerce.makePurchaseRequest request,
        io.grpc.stub.StreamObserver<ecommerce.makePurchaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMakePurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchItems(ecommerce.searchItemsRequest request,
        io.grpc.stub.StreamObserver<ecommerce.searchItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BuyerBlockingStub extends io.grpc.stub.AbstractBlockingStub<BuyerBlockingStub> {
    private BuyerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BuyerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuyerBlockingStub(channel, callOptions);
    }

    /**
     */
    public ecommerce.loginBuyerResponse loginBuyer(ecommerce.loginBuyerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginBuyerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.createBuyerAccountResponse createBuyerAccount(ecommerce.createBuyerAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBuyerAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.logoutBuyerResponse logoutBuyer(ecommerce.logoutBuyerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutBuyerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.addToShoppingCartResponse addToShoppingCart(ecommerce.addToShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToShoppingCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.removeFromShoppingCartResponse removeFromShoppingCart(ecommerce.removeFromShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFromShoppingCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.clearShoppingCartResponse clearShoppingCart(ecommerce.clearShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearShoppingCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.displayShoppingCartResponse displayShoppingCart(ecommerce.displayShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisplayShoppingCartMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.sellerRatingByBuyerResponse sellerRating(ecommerce.sellerRatingByBuyerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.feedBackSellerResponse feedBackSeller(ecommerce.feedBackSellerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFeedBackSellerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.purchaseHistoryResponse purchaseHistory(ecommerce.purchaseHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPurchaseHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.makePurchaseResponse makePurchase(ecommerce.makePurchaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMakePurchaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.searchItemsResponse searchItems(ecommerce.searchItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BuyerFutureStub extends io.grpc.stub.AbstractFutureStub<BuyerFutureStub> {
    private BuyerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BuyerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BuyerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.loginBuyerResponse> loginBuyer(
        ecommerce.loginBuyerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginBuyerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.createBuyerAccountResponse> createBuyerAccount(
        ecommerce.createBuyerAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBuyerAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.logoutBuyerResponse> logoutBuyer(
        ecommerce.logoutBuyerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutBuyerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.addToShoppingCartResponse> addToShoppingCart(
        ecommerce.addToShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToShoppingCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.removeFromShoppingCartResponse> removeFromShoppingCart(
        ecommerce.removeFromShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFromShoppingCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.clearShoppingCartResponse> clearShoppingCart(
        ecommerce.clearShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearShoppingCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.displayShoppingCartResponse> displayShoppingCart(
        ecommerce.displayShoppingCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisplayShoppingCartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.sellerRatingByBuyerResponse> sellerRating(
        ecommerce.sellerRatingByBuyerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.feedBackSellerResponse> feedBackSeller(
        ecommerce.feedBackSellerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFeedBackSellerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.purchaseHistoryResponse> purchaseHistory(
        ecommerce.purchaseHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPurchaseHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.makePurchaseResponse> makePurchase(
        ecommerce.makePurchaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMakePurchaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.searchItemsResponse> searchItems(
        ecommerce.searchItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN_BUYER = 0;
  private static final int METHODID_CREATE_BUYER_ACCOUNT = 1;
  private static final int METHODID_LOGOUT_BUYER = 2;
  private static final int METHODID_ADD_TO_SHOPPING_CART = 3;
  private static final int METHODID_REMOVE_FROM_SHOPPING_CART = 4;
  private static final int METHODID_CLEAR_SHOPPING_CART = 5;
  private static final int METHODID_DISPLAY_SHOPPING_CART = 6;
  private static final int METHODID_SELLER_RATING = 7;
  private static final int METHODID_FEED_BACK_SELLER = 8;
  private static final int METHODID_PURCHASE_HISTORY = 9;
  private static final int METHODID_MAKE_PURCHASE = 10;
  private static final int METHODID_SEARCH_ITEMS = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuyerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BuyerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN_BUYER:
          serviceImpl.loginBuyer((ecommerce.loginBuyerRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.loginBuyerResponse>) responseObserver);
          break;
        case METHODID_CREATE_BUYER_ACCOUNT:
          serviceImpl.createBuyerAccount((ecommerce.createBuyerAccountRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.createBuyerAccountResponse>) responseObserver);
          break;
        case METHODID_LOGOUT_BUYER:
          serviceImpl.logoutBuyer((ecommerce.logoutBuyerRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.logoutBuyerResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_SHOPPING_CART:
          serviceImpl.addToShoppingCart((ecommerce.addToShoppingCartRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.addToShoppingCartResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_SHOPPING_CART:
          serviceImpl.removeFromShoppingCart((ecommerce.removeFromShoppingCartRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.removeFromShoppingCartResponse>) responseObserver);
          break;
        case METHODID_CLEAR_SHOPPING_CART:
          serviceImpl.clearShoppingCart((ecommerce.clearShoppingCartRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.clearShoppingCartResponse>) responseObserver);
          break;
        case METHODID_DISPLAY_SHOPPING_CART:
          serviceImpl.displayShoppingCart((ecommerce.displayShoppingCartRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.displayShoppingCartResponse>) responseObserver);
          break;
        case METHODID_SELLER_RATING:
          serviceImpl.sellerRating((ecommerce.sellerRatingByBuyerRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.sellerRatingByBuyerResponse>) responseObserver);
          break;
        case METHODID_FEED_BACK_SELLER:
          serviceImpl.feedBackSeller((ecommerce.feedBackSellerRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.feedBackSellerResponse>) responseObserver);
          break;
        case METHODID_PURCHASE_HISTORY:
          serviceImpl.purchaseHistory((ecommerce.purchaseHistoryRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.purchaseHistoryResponse>) responseObserver);
          break;
        case METHODID_MAKE_PURCHASE:
          serviceImpl.makePurchase((ecommerce.makePurchaseRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.makePurchaseResponse>) responseObserver);
          break;
        case METHODID_SEARCH_ITEMS:
          serviceImpl.searchItems((ecommerce.searchItemsRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.searchItemsResponse>) responseObserver);
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

  private static abstract class BuyerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuyerBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ecommerce.BuyerOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Buyer");
    }
  }

  private static final class BuyerFileDescriptorSupplier
      extends BuyerBaseDescriptorSupplier {
    BuyerFileDescriptorSupplier() {}
  }

  private static final class BuyerMethodDescriptorSupplier
      extends BuyerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BuyerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BuyerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuyerFileDescriptorSupplier())
              .addMethod(getLoginBuyerMethod())
              .addMethod(getCreateBuyerAccountMethod())
              .addMethod(getLogoutBuyerMethod())
              .addMethod(getAddToShoppingCartMethod())
              .addMethod(getRemoveFromShoppingCartMethod())
              .addMethod(getClearShoppingCartMethod())
              .addMethod(getDisplayShoppingCartMethod())
              .addMethod(getSellerRatingMethod())
              .addMethod(getFeedBackSellerMethod())
              .addMethod(getPurchaseHistoryMethod())
              .addMethod(getMakePurchaseMethod())
              .addMethod(getSearchItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
