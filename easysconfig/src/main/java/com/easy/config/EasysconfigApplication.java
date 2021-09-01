package com.easy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EasysconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasysconfigApplication.class, args);
	}

}