package com.work2win.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
	
	public NewTopic createTopic() {
		return new NewTopic("groupNameSample2", 5, (short)1);
	}

}
