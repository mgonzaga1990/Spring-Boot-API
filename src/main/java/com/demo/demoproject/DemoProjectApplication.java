package com.demo.demoproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "DSA Stargate consumer API", version = "1.0", description = "DSA Stargate consumer API for Java Spring Boot Application"))
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
