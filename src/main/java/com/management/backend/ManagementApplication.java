package com.management.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;


@SpringBootApplication
@MapperScan(basePackages = {"com.management.backend.api.mybatis.mapper","com.management.backend.api.mybatis.casaded.mapper"})
@ComponentScan(basePackages = {"com.management.backend.config","com.management.backend.api.controller","com.management.backend.api.services"})
public class ManagementApplication {

	public static void main(String[] args) throws IOException {
	SpringApplication.run(ManagementApplication.class, args);
	}

}
