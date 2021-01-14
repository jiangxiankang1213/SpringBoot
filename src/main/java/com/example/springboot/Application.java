package com.example.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//SpringBootApplication(exclude={DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class})//不关联数据库时配置
@SpringBootApplication

@MapperScan("com.example.springboot")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
