package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

/**
 * 服务消费者(Rest Template版本)
 * 
 * @Author doctorrm
 * @Time 2017-12-06 下午3:38:42
 */
@EnableEurekaClient
@RestController // 将上这个才能实现mvc的restful和路由跳转功能。
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudLearningApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearningApplication.class, args);
	}

	/**
	 * 将使用RestTemplate来实现服务消费
	 * 
	 * @return
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	private EurekaClient discoveryClient;

	/**
	 * 纯粹用eureka从注册中心获取其它服务的信息
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String serviceUrl2() {
		InstanceInfo instance = discoveryClient.getNextServerFromEureka("service-8762", false);
		return instance.getHomePageUrl();
	}

}
