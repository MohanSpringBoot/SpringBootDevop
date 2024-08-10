package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevopApplication {

	
	@GetMapping("/get")
	public String  getdata(){
		return "my name is mohan";
	}
	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringBootDevopApplication.class, args);
	}

}
