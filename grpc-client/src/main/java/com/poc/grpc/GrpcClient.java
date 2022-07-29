package com.poc.grpc;

import com.poc.grpc.user.APIResponse;
import com.poc.grpc.user.LoginRequest;
import com.poc.grpc.user.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Sanjeev on ${DATE}
 * @Project: ${PROJECT_NAME}
 */

@Slf4j
public class GrpcClient {
	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder
				                         .forAddress("localhost", 9090)
				                         .usePlaintext()
				                         .build();
		
		// stubs - generate from proto files
		UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);
		LoginRequest request = LoginRequest.newBuilder().setUsername("User2").setPassword("Pass").build();
		APIResponse response = blockingStub.login(request);
		log.info(response.getResponseMessage());
	}
}