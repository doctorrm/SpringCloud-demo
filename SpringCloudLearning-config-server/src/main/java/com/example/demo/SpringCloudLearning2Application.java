package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置服务中心spring cloud config server（从远程如git仓库获取配置信息）
 * @Author doctorrm
 * @Time  2017-12-06 下午3:40:05
 */
@EnableConfigServer
@SpringBootApplication
public class SpringCloudLearning2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning2Application.class, args);
	}
	
	
}
