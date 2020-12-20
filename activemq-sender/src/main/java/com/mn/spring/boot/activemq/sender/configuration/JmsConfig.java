package com.mn.spring.boot.activemq.sender.configuration;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmsConfig {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("message-queue");
	}
}