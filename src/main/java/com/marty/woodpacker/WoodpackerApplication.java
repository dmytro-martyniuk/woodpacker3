package com.marty.woodpacker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.marty.woodpacker.mapper.ComicsMapper;
import com.marty.woodpacker.microservice.ComicsMicroservice;
import com.marty.woodpacker.microservice.impl.ComicsMicroserviceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WoodpackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WoodpackerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate () {
		return new RestTemplate();
	}

	@Bean
	public ComicsMicroservice comicsMicroservice() {
		return new ComicsMicroserviceImpl();
	}

	@Qualifier("mapper")
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
