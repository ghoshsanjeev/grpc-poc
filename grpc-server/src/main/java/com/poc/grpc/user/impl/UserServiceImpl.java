package com.poc.grpc.user.impl;

import com.poc.grpc.user.APIResponse;
import com.poc.grpc.user.Empty;
import com.poc.grpc.user.LoginRequest;
import com.poc.grpc.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Sanjeev on 30-07-2022
 * @Project: gRPC-demo
 */

@Slf4j
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {
	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		log.info("Logging in by " + request.getUsername());
		
		APIResponse.Builder response = APIResponse.newBuilder();
		
		response.setResponseMessage("Successfully logged in").setResponseCode(200);
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
		//super.login(request, responseObserver);
	}
	
	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		super.logout(request, responseObserver);
	}
}
