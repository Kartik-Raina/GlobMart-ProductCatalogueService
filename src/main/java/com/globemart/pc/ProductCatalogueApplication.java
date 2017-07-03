package com.globemart.pc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
@EnableJpaRepositories()

public class ProductCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}
}
