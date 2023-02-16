package ecommerce;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: SellerNew.proto")
public final class SellerGGrpc {

  private SellerGGrpc() {}

  public static final String SERVICE_NAME = "SellerG";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SLoginRequest,
      SLoginResponse> getSellerLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerLogin",
      requestType = SLoginRequest.class,
      responseType = SLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SLoginRequest,
      SLoginResponse> getSellerLoginMethod() {
    io.grpc.MethodDescriptor<SLoginRequest, SLoginResponse> getSellerLoginMethod;
    if ((getSellerLoginMethod = SellerGGrpc.getSellerLoginMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getSellerLoginMethod = SellerGGrpc.getSellerLoginMethod) == null) {
          SellerGGrpc.getSellerLoginMethod = getSellerLoginMethod =
              io.grpc.MethodDescriptor.<SLoginRequest, SLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("sellerLogin"))
              .build();
        }
      }
    }
    return getSellerLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SCreateAccountRequest,
      SCreateAccountResponse> getCreateSellerAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSellerAccount",
      requestType = SCreateAccountRequest.class,
      responseType = SCreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SCreateAccountRequest,
      SCreateAccountResponse> getCreateSellerAccountMethod() {
    io.grpc.MethodDescriptor<SCreateAccountRequest, SCreateAccountResponse> getCreateSellerAccountMethod;
    if ((getCreateSellerAccountMethod = SellerGGrpc.getCreateSellerAccountMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getCreateSellerAccountMethod = SellerGGrpc.getCreateSellerAccountMethod) == null) {
          SellerGGrpc.getCreateSellerAccountMethod = getCreateSellerAccountMethod =
              io.grpc.MethodDescriptor.<SCreateAccountRequest, SCreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSellerAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SCreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SCreateAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("createSellerAccount"))
              .build();
        }
      }
    }
    return getCreateSellerAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SLogoutRequest,
      SLogoutResponse> getLogoutSellerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logoutSeller",
      requestType = SLogoutRequest.class,
      responseType = SLogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SLogoutRequest,
      SLogoutResponse> getLogoutSellerMethod() {
    io.grpc.MethodDescriptor<SLogoutRequest, SLogoutResponse> getLogoutSellerMethod;
    if ((getLogoutSellerMethod = SellerGGrpc.getLogoutSellerMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getLogoutSellerMethod = SellerGGrpc.getLogoutSellerMethod) == null) {
          SellerGGrpc.getLogoutSellerMethod = getLogoutSellerMethod =
              io.grpc.MethodDescriptor.<SLogoutRequest, SLogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logoutSeller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SLogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SLogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("logoutSeller"))
              .build();
        }
      }
    }
    return getLogoutSellerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SRatingRequest,
      SRatingResponse> getSellerRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerRating",
      requestType = SRatingRequest.class,
      responseType = SRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SRatingRequest,
      SRatingResponse> getSellerRatingMethod() {
    io.grpc.MethodDescriptor<SRatingRequest, SRatingResponse> getSellerRatingMethod;
    if ((getSellerRatingMethod = SellerGGrpc.getSellerRatingMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getSellerRatingMethod = SellerGGrpc.getSellerRatingMethod) == null) {
          SellerGGrpc.getSellerRatingMethod = getSellerRatingMethod =
              io.grpc.MethodDescriptor.<SRatingRequest, SRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SRatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("sellerRating"))
              .build();
        }
      }
    }
    return getSellerRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SellerGStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerGStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerGStub>() {
        @Override
        public SellerGStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerGStub(channel, callOptions);
        }
      };
    return SellerGStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SellerGBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerGBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerGBlockingStub>() {
        @Override
        public SellerGBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerGBlockingStub(channel, callOptions);
        }
      };
    return SellerGBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SellerGFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SellerGFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SellerGFutureStub>() {
        @Override
        public SellerGFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SellerGFutureStub(channel, callOptions);
        }
      };
    return SellerGFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SellerGImplBase implements io.grpc.BindableService {

    /**
     */
    public void sellerLogin(SLoginRequest request,
                            io.grpc.stub.StreamObserver<SLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerLoginMethod(), responseObserver);
    }

    /**
     */
    public void createSellerAccount(SCreateAccountRequest request,
                                    io.grpc.stub.StreamObserver<SCreateAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSellerAccountMethod(), responseObserver);
    }

    /**
     */
    public void logoutSeller(SLogoutRequest request,
                             io.grpc.stub.StreamObserver<SLogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutSellerMethod(), responseObserver);
    }

    /**
     */
    public void sellerRating(SRatingRequest request,
                             io.grpc.stub.StreamObserver<SRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerRatingMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSellerLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SLoginRequest,
                SLoginResponse>(
                  this, METHODID_SELLER_LOGIN)))
          .addMethod(
            getCreateSellerAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SCreateAccountRequest,
                SCreateAccountResponse>(
                  this, METHODID_CREATE_SELLER_ACCOUNT)))
          .addMethod(
            getLogoutSellerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SLogoutRequest,
                SLogoutResponse>(
                  this, METHODID_LOGOUT_SELLER)))
          .addMethod(
            getSellerRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                SRatingRequest,
                SRatingResponse>(
                  this, METHODID_SELLER_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class SellerGStub extends io.grpc.stub.AbstractAsyncStub<SellerGStub> {
    private SellerGStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SellerGStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerGStub(channel, callOptions);
    }

    /**
     */
    public void sellerLogin(SLoginRequest request,
                            io.grpc.stub.StreamObserver<SLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSellerAccount(SCreateAccountRequest request,
                                    io.grpc.stub.StreamObserver<SCreateAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSellerAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logoutSeller(SLogoutRequest request,
                             io.grpc.stub.StreamObserver<SLogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutSellerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellerRating(SRatingRequest request,
                             io.grpc.stub.StreamObserver<SRatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SellerGBlockingStub extends io.grpc.stub.AbstractBlockingStub<SellerGBlockingStub> {
    private SellerGBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SellerGBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerGBlockingStub(channel, callOptions);
    }

    /**
     */
    public SLoginResponse sellerLogin(SLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public SCreateAccountResponse createSellerAccount(SCreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSellerAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public SLogoutResponse logoutSeller(SLogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutSellerMethod(), getCallOptions(), request);
    }

    /**
     */
    public SRatingResponse sellerRating(SRatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SellerGFutureStub extends io.grpc.stub.AbstractFutureStub<SellerGFutureStub> {
    private SellerGFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SellerGFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerGFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SLoginResponse> sellerLogin(
        SLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SCreateAccountResponse> createSellerAccount(
        SCreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSellerAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SLogoutResponse> logoutSeller(
        SLogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutSellerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<SRatingResponse> sellerRating(
        SRatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SELLER_LOGIN = 0;
  private static final int METHODID_CREATE_SELLER_ACCOUNT = 1;
  private static final int METHODID_LOGOUT_SELLER = 2;
  private static final int METHODID_SELLER_RATING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SellerGImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SellerGImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELLER_LOGIN:
          serviceImpl.sellerLogin((SLoginRequest) request,
              (io.grpc.stub.StreamObserver<SLoginResponse>) responseObserver);
          break;
        case METHODID_CREATE_SELLER_ACCOUNT:
          serviceImpl.createSellerAccount((SCreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<SCreateAccountResponse>) responseObserver);
          break;
        case METHODID_LOGOUT_SELLER:
          serviceImpl.logoutSeller((SLogoutRequest) request,
              (io.grpc.stub.StreamObserver<SLogoutResponse>) responseObserver);
          break;
        case METHODID_SELLER_RATING:
          serviceImpl.sellerRating((SRatingRequest) request,
              (io.grpc.stub.StreamObserver<SRatingResponse>) responseObserver);
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

  private static abstract class SellerGBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SellerGBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SellerNew.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SellerG");
    }
  }

  private static final class SellerGFileDescriptorSupplier
      extends SellerGBaseDescriptorSupplier {
    SellerGFileDescriptorSupplier() {}
  }

  private static final class SellerGMethodDescriptorSupplier
      extends SellerGBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SellerGMethodDescriptorSupplier(String methodName) {
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
      synchronized (SellerGGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SellerGFileDescriptorSupplier())
              .addMethod(getSellerLoginMethod())
              .addMethod(getCreateSellerAccountMethod())
              .addMethod(getLogoutSellerMethod())
              .addMethod(getSellerRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
