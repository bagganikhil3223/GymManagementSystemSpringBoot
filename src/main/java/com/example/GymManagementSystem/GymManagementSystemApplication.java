package com.example.GymManagementSystem;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
@EnableSwagger2
public class GymManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymManagementSystemApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguaration() {
		return new Docket(DocumentationType.SWAGGER_2).select()
			.paths(PathSelectors.ant("/app/*"))
			.apis(RequestHandlerSelectors.basePackage("com.example")).
			 build().
			 apiInfo(apiDetails());
	}
	private ApiInfo apiDetails() {
		return new ApiInfo(
				"Gym Management System App", 
				"Apis for Gym Management System", 
				"1.0", 
				"Free to use", 
				new springfox.documentation.service.Contact("Nikhil Bagga", "abc.com", "abcd@gmail.com"), 
				"Api License", 
				"abc.com",
				Collections.emptyList());
	}
	
}
