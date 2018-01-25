package com.truecorp.nam.test.application;

import java.nio.charset.Charset;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootTestWebApplication extends SpringBootServletInitializer  {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestWebApplication.class, args);
		System.out.println(String.format("file.encoding: %s", System.getProperty("file.encoding")));
		System.out.println(String.format("defaultCharset: %s", Charset.defaultCharset().name()));
		
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootTestWebApplication.class);
	}
}
