package com.work2win.service;

import java.util.logging.Logger;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaSampleConsumer {
	
	Logger log = Logger.getLogger(KafkaSampleConsumer.class.getName());
	
	@KafkaListener(topics = "groupNameSample2", groupId = "myGroupID-2")
	public void consume1SampleMsg(String message) {
		log.info("consumer1 consumes the msg"+message);
	}
	
	@KafkaListener(topics = "groupNameSample2", groupId = "myGroupID-2")
	public void consume2SampleMsg(String message) {
		log.info("consumer2 consumes the msg"+message);
	}
	
	@KafkaListener(topics = "groupNameSample2", groupId = "myGroupID-2")
	public void consume3SampleMsg(String message) {
		log.info("consumer3 consumes the msg"+message);
	}
	
	@KafkaListener(topics = "groupNameSample2", groupId = "myGroupID-2")
	public void consume4SampleMsg(String message) {
		log.info("consumer4 consumes the msg"+message);
	}

}
