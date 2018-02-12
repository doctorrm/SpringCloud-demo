package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	/**
	 * 通过名称调用服务，会自动向注册中心请求
	 * 
	 * @param name
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		// return
		// restTemplate.getForObject("http://localhost:8761/hi?name="+name,String.class);//ava.lang.IllegalStateException:
		// No instances available for localhost
		return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);// 只能通过名称来调用服务！！！
	}

	public String hiError(String name) {
		return "hi," + name + ",sorry,error!You are stuck in port 8760";
	}

}