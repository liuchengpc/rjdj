package com.apatech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.apatech.mapper")
public class RjdjApplication {

	public static void main(String[] args) {
		SpringApplication.run(RjdjApplication.class, args);
	}

}
