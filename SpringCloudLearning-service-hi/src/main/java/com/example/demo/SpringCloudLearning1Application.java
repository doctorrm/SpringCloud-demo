package com.example.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者(Rest Template)
 * 
 * @Author doctorrm
 * @Time 2017-12-06 下午3:40:24
 */

@RestController
@SpringBootApplication
public class SpringCloudLearning1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning1Application.class, args);
	}

	private static final Logger LOG = Logger.getLogger(SpringCloudLearning1Application.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/hi")
	public String callHome() {
		LOG.log(Priority.INFO, "calling trace service-hi");
		return restTemplate.getForObject("http://localhost:8989/hi", String.class);
	}

	@RequestMapping("/inofo")
	public String info() {
		LOG.log(Priority.INFO, "calling trace service-hi ");
		System.out.println("哈哈哈！");
		return "bear monster";
	}
	
	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}
}
