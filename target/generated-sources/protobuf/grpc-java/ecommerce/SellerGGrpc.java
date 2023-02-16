
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
  private static volatile io.grpc.MethodDescriptor<ecommerce.SLoginRequest,
      ecommerce.SLoginResponse> getSellerLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerLogin",
      requestType = ecommerce.SLoginRequest.class,
      responseType = ecommerce.SLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.SLoginRequest,
      ecommerce.SLoginResponse> getSellerLoginMethod() {
    io.grpc.MethodDescriptor<ecommerce.SLoginRequest, ecommerce.SLoginResponse> getSellerLoginMethod;
    if ((getSellerLoginMethod = SellerGGrpc.getSellerLoginMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getSellerLoginMethod = SellerGGrpc.getSellerLoginMethod) == null) {
          SellerGGrpc.getSellerLoginMethod = getSellerLoginMethod =
              io.grpc.MethodDescriptor.<ecommerce.SLoginRequest, ecommerce.SLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("sellerLogin"))
              .build();
        }
      }
    }
    return getSellerLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.SCreateAccountRequest,
      ecommerce.SCreateAccountResponse> getCreateSellerAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSellerAccount",
      requestType = ecommerce.SCreateAccountRequest.class,
      responseType = ecommerce.SCreateAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.SCreateAccountRequest,
      ecommerce.SCreateAccountResponse> getCreateSellerAccountMethod() {
    io.grpc.MethodDescriptor<ecommerce.SCreateAccountRequest, ecommerce.SCreateAccountResponse> getCreateSellerAccountMethod;
    if ((getCreateSellerAccountMethod = SellerGGrpc.getCreateSellerAccountMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getCreateSellerAccountMethod = SellerGGrpc.getCreateSellerAccountMethod) == null) {
          SellerGGrpc.getCreateSellerAccountMethod = getCreateSellerAccountMethod =
              io.grpc.MethodDescriptor.<ecommerce.SCreateAccountRequest, ecommerce.SCreateAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSellerAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SCreateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SCreateAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("createSellerAccount"))
              .build();
        }
      }
    }
    return getCreateSellerAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.SLogoutRequest,
      ecommerce.SLogoutResponse> getLogoutSellerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logoutSeller",
      requestType = ecommerce.SLogoutRequest.class,
      responseType = ecommerce.SLogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.SLogoutRequest,
      ecommerce.SLogoutResponse> getLogoutSellerMethod() {
    io.grpc.MethodDescriptor<ecommerce.SLogoutRequest, ecommerce.SLogoutResponse> getLogoutSellerMethod;
    if ((getLogoutSellerMethod = SellerGGrpc.getLogoutSellerMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getLogoutSellerMethod = SellerGGrpc.getLogoutSellerMethod) == null) {
          SellerGGrpc.getLogoutSellerMethod = getLogoutSellerMethod =
              io.grpc.MethodDescriptor.<ecommerce.SLogoutRequest, ecommerce.SLogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "logoutSeller"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SLogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SLogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SellerGMethodDescriptorSupplier("logoutSeller"))
              .build();
        }
      }
    }
    return getLogoutSellerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ecommerce.SRatingRequest,
      ecommerce.SRatingResponse> getSellerRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sellerRating",
      requestType = ecommerce.SRatingRequest.class,
      responseType = ecommerce.SRatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ecommerce.SRatingRequest,
      ecommerce.SRatingResponse> getSellerRatingMethod() {
    io.grpc.MethodDescriptor<ecommerce.SRatingRequest, ecommerce.SRatingResponse> getSellerRatingMethod;
    if ((getSellerRatingMethod = SellerGGrpc.getSellerRatingMethod) == null) {
      synchronized (SellerGGrpc.class) {
        if ((getSellerRatingMethod = SellerGGrpc.getSellerRatingMethod) == null) {
          SellerGGrpc.getSellerRatingMethod = getSellerRatingMethod =
              io.grpc.MethodDescriptor.<ecommerce.SRatingRequest, ecommerce.SRatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sellerRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SRatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ecommerce.SRatingResponse.getDefaultInstance()))
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
        @java.lang.Override
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
        @java.lang.Override
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
        @java.lang.Override
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
    public void sellerLogin(ecommerce.SLoginRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerLoginMethod(), responseObserver);
    }

    /**
     */
    public void createSellerAccount(ecommerce.SCreateAccountRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SCreateAccountResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSellerAccountMethod(), responseObserver);
    }

    /**
     */
    public void logoutSeller(ecommerce.SLogoutRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SLogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutSellerMethod(), responseObserver);
    }

    /**
     */
    public void sellerRating(ecommerce.SRatingRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SRatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSellerRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSellerLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.SLoginRequest,
                ecommerce.SLoginResponse>(
                  this, METHODID_SELLER_LOGIN)))
          .addMethod(
            getCreateSellerAccountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.SCreateAccountRequest,
                ecommerce.SCreateAccountResponse>(
                  this, METHODID_CREATE_SELLER_ACCOUNT)))
          .addMethod(
            getLogoutSellerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.SLogoutRequest,
                ecommerce.SLogoutResponse>(
                  this, METHODID_LOGOUT_SELLER)))
          .addMethod(
            getSellerRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ecommerce.SRatingRequest,
                ecommerce.SRatingResponse>(
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

    @java.lang.Override
    protected SellerGStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerGStub(channel, callOptions);
    }

    /**
     */
    public void sellerLogin(ecommerce.SLoginRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSellerAccount(ecommerce.SCreateAccountRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SCreateAccountResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSellerAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logoutSeller(ecommerce.SLogoutRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SLogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutSellerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sellerRating(ecommerce.SRatingRequest request,
        io.grpc.stub.StreamObserver<ecommerce.SRatingResponse> responseObserver) {
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

    @java.lang.Override
    protected SellerGBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerGBlockingStub(channel, callOptions);
    }

    /**
     */
    public ecommerce.SLoginResponse sellerLogin(ecommerce.SLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSellerLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.SCreateAccountResponse createSellerAccount(ecommerce.SCreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSellerAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.SLogoutResponse logoutSeller(ecommerce.SLogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutSellerMethod(), getCallOptions(), request);
    }

    /**
     */
    public ecommerce.SRatingResponse sellerRating(ecommerce.SRatingRequest request) {
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

    @java.lang.Override
    protected SellerGFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SellerGFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.SLoginResponse> sellerLogin(
        ecommerce.SLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSellerLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.SCreateAccountResponse> createSellerAccount(
        ecommerce.SCreateAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSellerAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.SLogoutResponse> logoutSeller(
        ecommerce.SLogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutSellerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ecommerce.SRatingResponse> sellerRating(
        ecommerce.SRatingRequest request) {
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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELLER_LOGIN:
          serviceImpl.sellerLogin((ecommerce.SLoginRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.SLoginResponse>) responseObserver);
          break;
        case METHODID_CREATE_SELLER_ACCOUNT:
          serviceImpl.createSellerAccount((ecommerce.SCreateAccountRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.SCreateAccountResponse>) responseObserver);
          break;
        case METHODID_LOGOUT_SELLER:
          serviceImpl.logoutSeller((ecommerce.SLogoutRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.SLogoutResponse>) responseObserver);
          break;
        case METHODID_SELLER_RATING:
          serviceImpl.sellerRating((ecommerce.SRatingRequest) request,
              (io.grpc.stub.StreamObserver<ecommerce.SRatingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
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

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ecommerce.SellerNew.getDescriptor();
    }

    @java.lang.Override
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

    @java.lang.Override
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
