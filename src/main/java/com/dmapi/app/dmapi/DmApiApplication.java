package com.dmapi.app.dmapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.dmapi.app.dmapi.domain")
@EnableJpaRepositories("com.dmapi.app.dmapi.infrastructure.repository")
@Configuration
public class DmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmApiApplication.class, args);
	}

}
