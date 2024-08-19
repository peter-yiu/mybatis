package com.alicorn.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlicornApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlicornApplication.class, args);
	}

}




/*
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello, Spring Boot! Arguments received: " + Arrays.asList(args));
	}
}*/
