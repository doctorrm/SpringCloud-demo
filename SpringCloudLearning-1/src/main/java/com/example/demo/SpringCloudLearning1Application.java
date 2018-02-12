package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者1
 * @Author doctorrm
 * @Time 2017-12-06 下午3:40:24
 */

@EnableEurekaClient//注册到中心
@RestController
@SpringBootApplication
public class SpringCloudLearning1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning1Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

	@RequestMapping("/good")
	public String home() {
		return "doctor,you are in 8761 service!";
	}
}
