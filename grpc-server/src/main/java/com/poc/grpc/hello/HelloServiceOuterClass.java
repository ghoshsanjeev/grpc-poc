// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.poc.grpc.hello;

public final class HelloServiceOuterClass {
  private HelloServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_poc_grpc_hello_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_poc_grpc_hello_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_poc_grpc_hello_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_poc_grpc_hello_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HelloService.proto\022\022com.poc.grpc.hello" +
      "\"3\n\014HelloRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010l" +
      "astName\030\002 \001(\t\"!\n\rHelloResponse\022\020\n\010greeti" +
      "ng\030\001 \001(\t2\\\n\014HelloService\022L\n\005hello\022 .com." +
      "poc.grpc.hello.HelloRequest\032!.com.poc.gr" +
      "pc.hello.HelloResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_poc_grpc_hello_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_poc_grpc_hello_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_poc_grpc_hello_HelloRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_poc_grpc_hello_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_poc_grpc_hello_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_poc_grpc_hello_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
