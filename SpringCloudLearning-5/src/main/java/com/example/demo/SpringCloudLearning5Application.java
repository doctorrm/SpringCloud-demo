package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 服务消费者（Feign版本）
 * @Author doctorrm
 * @Time  2017-12-07 下午8:24:06
 */
@EnableFeignClients
@SpringBootApplication
public class SpringCloudLearning5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning5Application.class, args);
	}
}
