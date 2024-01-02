package com.example.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
@EnableAutoConfiguration
public class DemoApplication {

	// @RequestMapping("/")
	// String home()
	// {
	// 	return "Hello Kamal";
	// }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
