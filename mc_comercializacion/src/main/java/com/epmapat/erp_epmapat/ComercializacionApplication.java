package com.epmapat.erp_epmapat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComercializacionApplication {
	public static void main(String[] args) {
		SpringApplication.run(ComercializacionApplication.class, args);
	}

}