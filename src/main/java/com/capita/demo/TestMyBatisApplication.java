package com.capita.demo;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capita.demo.model.User;

@SpringBootApplication
@MapperScan("com.capita.demo.dao.mapper")
@MappedTypes(User.class)
public class TestMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMyBatisApplication.class, args);
	}

}
