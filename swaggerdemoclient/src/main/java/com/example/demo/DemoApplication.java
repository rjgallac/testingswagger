package com.example.demo;

import io.swagger.client.ApiClient;
import io.swagger.client.api.HelloControllerApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ApiClient apiClient() {
		return new ApiClient().setBasePath("http://localhost:8080");
	}

	@Bean
	public HelloControllerApi helloControllerApi(){
		return new HelloControllerApi(apiClient());
	}
}
