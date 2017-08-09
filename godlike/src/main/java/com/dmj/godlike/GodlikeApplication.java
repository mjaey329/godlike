package com.dmj.godlike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GodlikeApplication {

	public static void main(String[] args) {

		String s = "有错误！";
		try {
			if (s != null)
				throw new MyException(s);
		} catch (MyException e) {
			System.out.println(s);
		}finally{
			System.out.println("end!");
		}
		SpringApplication.run(GodlikeApplication.class, args);

	}
}
