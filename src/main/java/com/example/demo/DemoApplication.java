package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

	@RequestMapping("/")
	String home()
	{
		return "Hello Kamal";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
