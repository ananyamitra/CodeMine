package com.inventory.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.inventory.services"})
@SpringBootApplication
public class ServicesApp {
	
	public static void main(String[] args){
		SpringApplication.run(ServicesApp.class, args);
	}

}
