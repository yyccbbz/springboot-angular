package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.transaction.annotation.*;

@SpringBootApplication
@EnableJpaRepositories(basePackages ={ "com.app.repo"})
@EntityScan(basePackages ={ "com.app.model"})
@EnableTransactionManagement
public class MainApp {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(MainApp.class,args);

        System.err.println("sample started 1. http://localhost:9119");
	}
}
