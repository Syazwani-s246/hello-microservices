package com.feign.HelloOpenFeignAddressApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HelloOpenFeignAddressApp {

	public static void main(String[] args) {
		SpringApplication.run(HelloOpenFeignAddressApp.class, args);
	}

}
