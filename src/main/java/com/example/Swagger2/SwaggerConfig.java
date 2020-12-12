package com.example.Swagger2;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Configuration
public class SwaggerConfig {
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
