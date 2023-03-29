package com.coshmex.store;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProductosApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductosApp.class, args);
	}

}
