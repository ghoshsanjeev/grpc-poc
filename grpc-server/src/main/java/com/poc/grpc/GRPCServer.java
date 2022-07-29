package com.poc.grpc;

import com.poc.grpc.user.impl.UserServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author Sanjeev on ${DATE}
 * @Project: ${PROJECT_NAME}
 */

@Slf4j
public class GRPCServer {
	public static void main(String[] args) throws IOException, InterruptedException {
		Server server = ServerBuilder
				                .forPort(9090)
				                .addService(new UserServiceImpl())
				                .build();
		server.start();
		log.info("Server started at " + server.getPort());
		server.awaitTermination();
	}
}