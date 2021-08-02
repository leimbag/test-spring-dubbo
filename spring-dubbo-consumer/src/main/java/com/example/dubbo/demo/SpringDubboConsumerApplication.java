package com.example.dubbo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(value = {"classpath:META-INF/spring/bean-service-dubbo.xml"})
@SpringBootApplication
public class SpringDubboConsumerApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringDubboConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDubboConsumerApplication.class, args);
		logger.info("启动完毕");
	}

}
