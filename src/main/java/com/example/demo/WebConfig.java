package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig  implements WebMvcConfigurer{

	
	  @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**") // Allow CORS requests to all endpoints
	                .allowedOrigins("http://localhost:3000") // Allow specific origins
	                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow specific HTTP methods
	                .allowedHeaders("*") // Allow all headers
	                .allowCredentials(true); // Allow credentials (cookies, authorization headers, etc.)
	    }
}
