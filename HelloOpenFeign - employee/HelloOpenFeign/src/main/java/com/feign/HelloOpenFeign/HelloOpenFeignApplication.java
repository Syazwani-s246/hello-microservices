package com.feign.HelloOpenFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HelloOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloOpenFeignApplication.class, args);
	}

}
