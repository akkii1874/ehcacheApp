package com.ehcacheApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class EhcacheAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheAppApplication.class, args);
	}

}
