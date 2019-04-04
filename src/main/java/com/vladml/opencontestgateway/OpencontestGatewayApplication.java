package com.vladml.opencontestgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class OpencontestGatewayApplication {


	public static void main(String[] args) {
		SpringApplication.run(OpencontestGatewayApplication.class, args);
	}

}
