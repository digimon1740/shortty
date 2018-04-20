package com.digimon.shortty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShorttyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShorttyApplication.class, args);

		ShorttyWebClient swc = new ShorttyWebClient();
	}
}
