package br.com.tway.handicare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HandicareApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandicareApplication.class, args);
	}

}