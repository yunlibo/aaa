package com.epas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EpasApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EpasApplication.class);
        springApplication.run(args);
	}
}
