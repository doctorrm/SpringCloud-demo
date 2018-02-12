package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 服务提供者2
 * 
 * @Author doctorrm
 * @Time 2017-12-06 下午3:40:05
 */
@EnableEurekaClient // 注册到中心
@RestController
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class SpringCloudLearning2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning2Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

	public String hiError(String name) {
		return "hi," + name + ",sorry,error!";
	}
}
