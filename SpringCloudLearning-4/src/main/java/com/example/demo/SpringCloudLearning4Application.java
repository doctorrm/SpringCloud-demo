package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * 服务网关Zuul，由yml设置路由
 * @Author doctorrm
 * @Time  2017-12-08 上午10:26:23
 */
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudLearning4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning4Application.class, args);
	}
}
