package com.dmj.godlike;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@ConfigurationProperties(prefix="spring.datasource") 
//@MapperScan("com.dmj.godlike.mapper")
public class GodlikeApplication {
	@RequestMapping("/hell")
	public String index() {
		return "Hello World xx";
	}

	public static void main(String[] args) {

		SpringApplication.run(GodlikeApplication.class, args);

	}
}
