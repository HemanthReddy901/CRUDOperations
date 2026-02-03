package com.jdbc.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(CrudApplication.class, args);
		context.getBean(Product.class);
		System.out.println("Started");
	}

}
