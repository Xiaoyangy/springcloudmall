package com.chy.server_provide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerProvideApplication.class, args);
	}

}
