package com.orelly.PhraseOMatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.orelly.PhraseOMatic")
public class PhraseOMaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhraseOMaticApplication.class, args);
	}
}
