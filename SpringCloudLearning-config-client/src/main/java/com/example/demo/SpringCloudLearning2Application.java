package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置服务客户端，暂时用不了，出错了，foo
 * @Author doctorrm
 * @Time  2017-12-06 下午3:40:05
 */
@RestController
@SpringBootApplication
public class SpringCloudLearning2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLearning2Application.class, args);
	}
	
	@Value("${foo}")//出错，启动不了
    String foo;
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
