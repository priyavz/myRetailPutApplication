package com.myretail.put;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.myretail.put.controller")
@ComponentScan("com.myretail.put.service")
@ComponentScan("com.myretail.common.dao")
@Slf4j
public class MyRetailPutServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRetailPutServiceApplication.class, args);
	}

}
