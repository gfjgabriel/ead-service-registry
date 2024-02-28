package com.ead.eadserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EadServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EadServiceRegistryApplication.class, args);
	}

}
