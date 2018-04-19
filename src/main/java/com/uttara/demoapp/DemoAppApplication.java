package com.uttara.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}
}


@RestController
class TestController{
	//test jenkins
	@GetMapping("/")
	public String sayHello(){
		return "Hello Spring cloud 1234 test jenkins!!!!";
	}
}
