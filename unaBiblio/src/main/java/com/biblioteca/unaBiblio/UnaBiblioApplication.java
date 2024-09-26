package com.biblioteca.unaBiblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication


//@ComponentScan(basePackages = "models")
//@ComponentScan(basePackages = "repositories")
//@ComponentScan(basePackages = "services")
//@ComponentScan(basePackages = "controllers")
//@ComponentScan(basePackages = "dto")

//@EnableJpaRepositories(basePackages = "repositories")

public class UnaBiblioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnaBiblioApplication.class, args);
	}

}
