package UserSystemStack;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: UserService.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserSystemStack.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<UserSystemStack.registerRequest,
      UserSystemStack.registerResponse> METHOD_REGISTER =
      io.grpc.MethodDescriptor.<UserSystemStack.registerRequest, UserSystemStack.registerResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "UserSystemStack.UserService", "register"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.registerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.registerResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<UserSystemStack.loginRequest,
      UserSystemStack.loginResponse> METHOD_LOGIN =
      io.grpc.MethodDescriptor.<UserSystemStack.loginRequest, UserSystemStack.loginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "UserSystemStack.UserService", "login"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.loginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.loginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<UserSystemStack.getUserInformationRequest,
      UserSystemStack.getUserInformationResponse> METHOD_GET_USER_INFORMATION =
      io.grpc.MethodDescriptor.<UserSystemStack.getUserInformationRequest, UserSystemStack.getUserInformationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "UserSystemStack.UserService", "getUserInformation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.getUserInformationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.getUserInformationResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<UserSystemStack.userValidationRequest,
      UserSystemStack.userValidationResponse> METHOD_USER_VALIDATION =
      io.grpc.MethodDescriptor.<UserSystemStack.userValidationRequest, UserSystemStack.userValidationResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "UserSystemStack.UserService", "userValidation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.userValidationRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              UserSystemStack.userValidationResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(UserSystemStack.registerRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.registerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    /**
     */
    public void login(UserSystemStack.loginRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.loginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN, responseObserver);
    }

    /**
     */
    public void getUserInformation(UserSystemStack.getUserInformationRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.getUserInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFORMATION, responseObserver);
    }

    /**
     */
    public void userValidation(UserSystemStack.userValidationRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.userValidationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_USER_VALIDATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                UserSystemStack.registerRequest,
                UserSystemStack.registerResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            METHOD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                UserSystemStack.loginRequest,
                UserSystemStack.loginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            METHOD_GET_USER_INFORMATION,
            asyncUnaryCall(
              new MethodHandlers<
                UserSystemStack.getUserInformationRequest,
                UserSystemStack.getUserInformationResponse>(
                  this, METHODID_GET_USER_INFORMATION)))
          .addMethod(
            METHOD_USER_VALIDATION,
            asyncUnaryCall(
              new MethodHandlers<
                UserSystemStack.userValidationRequest,
                UserSystemStack.userValidationResponse>(
                  this, METHODID_USER_VALIDATION)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(UserSystemStack.registerRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.registerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(UserSystemStack.loginRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.loginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserInformation(UserSystemStack.getUserInformationRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.getUserInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFORMATION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userValidation(UserSystemStack.userValidationRequest request,
        io.grpc.stub.StreamObserver<UserSystemStack.userValidationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_USER_VALIDATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public UserSystemStack.registerResponse register(UserSystemStack.registerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    /**
     */
    public UserSystemStack.loginResponse login(UserSystemStack.loginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN, getCallOptions(), request);
    }

    /**
     */
    public UserSystemStack.getUserInformationResponse getUserInformation(UserSystemStack.getUserInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFORMATION, getCallOptions(), request);
    }

    /**
     */
    public UserSystemStack.userValidationResponse userValidation(UserSystemStack.userValidationRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_USER_VALIDATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserSystemStack.registerResponse> register(
        UserSystemStack.registerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserSystemStack.loginResponse> login(
        UserSystemStack.loginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserSystemStack.getUserInformationResponse> getUserInformation(
        UserSystemStack.getUserInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFORMATION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<UserSystemStack.userValidationResponse> userValidation(
        UserSystemStack.userValidationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_USER_VALIDATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_GET_USER_INFORMATION = 2;
  private static final int METHODID_USER_VALIDATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((UserSystemStack.registerRequest) request,
              (io.grpc.stub.StreamObserver<UserSystemStack.registerResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((UserSystemStack.loginRequest) request,
              (io.grpc.stub.StreamObserver<UserSystemStack.loginResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFORMATION:
          serviceImpl.getUserInformation((UserSystemStack.getUserInformationRequest) request,
              (io.grpc.stub.StreamObserver<UserSystemStack.getUserInformationResponse>) responseObserver);
          break;
        case METHODID_USER_VALIDATION:
          serviceImpl.userValidation((UserSystemStack.userValidationRequest) request,
              (io.grpc.stub.StreamObserver<UserSystemStack.userValidationResponse>) responseObserver);
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

  private static final class UserServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return UserSystemStack.UserServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceDescriptorSupplier())
              .addMethod(METHOD_REGISTER)
              .addMethod(METHOD_LOGIN)
              .addMethod(METHOD_GET_USER_INFORMATION)
              .addMethod(METHOD_USER_VALIDATION)
              .build();
        }
      }
    }
    return result;
  }
}
