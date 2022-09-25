package com.myheadchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


///me


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MyheadchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyheadchatApplication.class, args);
	}

}
