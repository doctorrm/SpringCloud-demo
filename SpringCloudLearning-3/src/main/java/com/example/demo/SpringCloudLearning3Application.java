package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;


/**
 * 注册中心
 * @Author doctorrm
 * @Time  2017-12-06 下午4:10:03
 */
@EnableEurekaServer//声明为注册中心
//@RestController不加rest controller，外部就无法通过url直接访问中心
@SpringBootApplication
public class SpringCloudLearning3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning3Application.class, args);
	}
}
