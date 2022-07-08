package com.rvsoni.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.rvsoni.demo.jpa")
@EntityScan(basePackages = "com.rvsoni.demo.jpa")
@ComponentScan(basePackages = "com.rvsoni.demo")
@SpringBootApplication
public class MavenDemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MavenDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MavenDemoApplication.class, args);
	}
}
