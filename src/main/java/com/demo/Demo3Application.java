package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Service;

@SpringBootApplication
@MapperScan("com.demo.dao")
@Service("com.demo.service")
public class Demo3Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}
}
