package com.mn.spring.boot.activemq.sender.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mqmessage/")
public class MessageController {
	
	@Autowired
	JmsTemplate jmsTemplate;
	@Autowired
	Queue queue;
	
	@GetMapping(value = "/{message}")
	public void publishMessage(@PathVariable String message) {
		jmsTemplate.convertAndSend(queue, message);
	}
	
}
