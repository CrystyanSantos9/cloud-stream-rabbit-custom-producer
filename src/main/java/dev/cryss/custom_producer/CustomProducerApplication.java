package dev.cryss.custom_producer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CustomProducerApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println ("começou");
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomProducerApplication.class, args);
	}


}
