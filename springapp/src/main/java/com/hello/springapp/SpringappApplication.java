package com.hello.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
