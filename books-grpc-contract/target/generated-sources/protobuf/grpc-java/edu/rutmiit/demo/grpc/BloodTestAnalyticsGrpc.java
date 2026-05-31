package edu.rutmiit.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервисы
 * Unary RPC - один запрос это один ответ (типа аналог REST GET/POST)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.66.0)",
    comments = "Source: bloodtest_analytics.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BloodTestAnalyticsGrpc {

  private BloodTestAnalyticsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "bloodtestanalytics.BloodTestAnalytics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest,
      edu.rutmiit.demo.grpc.BloodTestAnalysisResponse> getAnalyzeBloodTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeBloodTest",
      requestType = edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest.class,
      responseType = edu.rutmiit.demo.grpc.BloodTestAnalysisResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest,
      edu.rutmiit.demo.grpc.BloodTestAnalysisResponse> getAnalyzeBloodTestMethod() {
    io.grpc.MethodDescriptor<edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest, edu.rutmiit.demo.grpc.BloodTestAnalysisResponse> getAnalyzeBloodTestMethod;
    if ((getAnalyzeBloodTestMethod = BloodTestAnalyticsGrpc.getAnalyzeBloodTestMethod) == null) {
      synchronized (BloodTestAnalyticsGrpc.class) {
        if ((getAnalyzeBloodTestMethod = BloodTestAnalyticsGrpc.getAnalyzeBloodTestMethod) == null) {
          BloodTestAnalyticsGrpc.getAnalyzeBloodTestMethod = getAnalyzeBloodTestMethod =
              io.grpc.MethodDescriptor.<edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest, edu.rutmiit.demo.grpc.BloodTestAnalysisResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeBloodTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.rutmiit.demo.grpc.BloodTestAnalysisResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BloodTestAnalyticsMethodDescriptorSupplier("AnalyzeBloodTest"))
              .build();
        }
      }
    }
    return getAnalyzeBloodTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BloodTestAnalyticsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BloodTestAnalyticsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BloodTestAnalyticsStub>() {
        @java.lang.Override
        public BloodTestAnalyticsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BloodTestAnalyticsStub(channel, callOptions);
        }
      };
    return BloodTestAnalyticsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BloodTestAnalyticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BloodTestAnalyticsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BloodTestAnalyticsBlockingStub>() {
        @java.lang.Override
        public BloodTestAnalyticsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BloodTestAnalyticsBlockingStub(channel, callOptions);
        }
      };
    return BloodTestAnalyticsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BloodTestAnalyticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BloodTestAnalyticsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BloodTestAnalyticsFutureStub>() {
        @java.lang.Override
        public BloodTestAnalyticsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BloodTestAnalyticsFutureStub(channel, callOptions);
        }
      };
    return BloodTestAnalyticsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервисы
   * Unary RPC - один запрос это один ответ (типа аналог REST GET/POST)
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Анализирует книгу и возвращает вычисленные метрики
     * </pre>
     */
    default void analyzeBloodTest(edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest request,
        io.grpc.stub.StreamObserver<edu.rutmiit.demo.grpc.BloodTestAnalysisResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeBloodTestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BloodTestAnalytics.
   * <pre>
   * Сервисы
   * Unary RPC - один запрос это один ответ (типа аналог REST GET/POST)
   * </pre>
   */
  public static abstract class BloodTestAnalyticsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BloodTestAnalyticsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BloodTestAnalytics.
   * <pre>
   * Сервисы
   * Unary RPC - один запрос это один ответ (типа аналог REST GET/POST)
   * </pre>
   */
  public static final class BloodTestAnalyticsStub
      extends io.grpc.stub.AbstractAsyncStub<BloodTestAnalyticsStub> {
    private BloodTestAnalyticsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BloodTestAnalyticsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BloodTestAnalyticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Анализирует книгу и возвращает вычисленные метрики
     * </pre>
     */
    public void analyzeBloodTest(edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest request,
        io.grpc.stub.StreamObserver<edu.rutmiit.demo.grpc.BloodTestAnalysisResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeBloodTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BloodTestAnalytics.
   * <pre>
   * Сервисы
   * Unary RPC - один запрос это один ответ (типа аналог REST GET/POST)
   * </pre>
   */
  public static final class BloodTestAnalyticsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BloodTestAnalyticsBlockingStub> {
    private BloodTestAnalyticsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BloodTestAnalyticsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BloodTestAnalyticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Анализирует книгу и возвращает вычисленные метрики
     * </pre>
     */
    public edu.rutmiit.demo.grpc.BloodTestAnalysisResponse analyzeBloodTest(edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeBloodTestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BloodTestAnalytics.
   * <pre>
   * Сервисы
   * Unary RPC - один запрос это один ответ (типа аналог REST GET/POST)
   * </pre>
   */
  public static final class BloodTestAnalyticsFutureStub
      extends io.grpc.stub.AbstractFutureStub<BloodTestAnalyticsFutureStub> {
    private BloodTestAnalyticsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BloodTestAnalyticsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BloodTestAnalyticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Анализирует книгу и возвращает вычисленные метрики
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.rutmiit.demo.grpc.BloodTestAnalysisResponse> analyzeBloodTest(
        edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeBloodTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALYZE_BLOOD_TEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANALYZE_BLOOD_TEST:
          serviceImpl.analyzeBloodTest((edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest) request,
              (io.grpc.stub.StreamObserver<edu.rutmiit.demo.grpc.BloodTestAnalysisResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAnalyzeBloodTestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              edu.rutmiit.demo.grpc.AnalyzeBloodTestRequest,
              edu.rutmiit.demo.grpc.BloodTestAnalysisResponse>(
                service, METHODID_ANALYZE_BLOOD_TEST)))
        .build();
  }

  private static abstract class BloodTestAnalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BloodTestAnalyticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.rutmiit.demo.grpc.BloodtestAnalytics.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BloodTestAnalytics");
    }
  }

  private static final class BloodTestAnalyticsFileDescriptorSupplier
      extends BloodTestAnalyticsBaseDescriptorSupplier {
    BloodTestAnalyticsFileDescriptorSupplier() {}
  }

  private static final class BloodTestAnalyticsMethodDescriptorSupplier
      extends BloodTestAnalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BloodTestAnalyticsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BloodTestAnalyticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BloodTestAnalyticsFileDescriptorSupplier())
              .addMethod(getAnalyzeBloodTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
