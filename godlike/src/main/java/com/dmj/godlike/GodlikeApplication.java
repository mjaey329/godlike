package com.dmj.godlike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GodlikeApplication {
    @RequestMapping("/hell")
    public String index() {
        return "Hello World xx";
    }
	public static void main(String[] args) {
		System.out.println("123");
		SpringApplication.run(GodlikeApplication.class, args);
		
		
	}
}
