package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zipkin.server.EnableZipkinServer;

/**
 * 服务提供者2
 * 
 * @Author doctorrm
 * @Time 2017-12-06 下午3:40:05
 */
@EnableZipkinServer
@SpringBootApplication
public class SpringCloudLearning2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning2Application.class, args);
	}

}
