package com.management.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.cors.CorsConfiguration;

import org.springframework.web.filter.CorsFilter;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.io.IOException;

@SpringBootApplication
@MapperScan(basePackages = {"com.management.backend.api.mybatis.mapper","com.management.backend.api.mybatis.casaded.mapper"})
@ComponentScan(basePackages = {"com.management.backend.config","com.management.backend.api.controller","com.management.backend.api.services"})
public class ManagementApplication {

	private CorsConfiguration buildConfig() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		return corsConfiguration;
	}

	/**
	 * 跨域过滤器
	 * @return
	 */
	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", buildConfig()); // 4
		return new CorsFilter(source);
	}

	public static void main(String[] args) throws IOException {
	SpringApplication.run(ManagementApplication.class, args);
	}

}
