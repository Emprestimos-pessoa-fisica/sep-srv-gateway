package io.github.sep.svcgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class SvcGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcGatewayApplication.class, args);
	}

}
