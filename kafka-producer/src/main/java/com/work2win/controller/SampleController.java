package com.work2win.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.work2win.service.KafkaSamplePublisher;

@RestController
@RequestMapping("/sampleProducer")
public class SampleController {
	
	@Autowired
	private KafkaSamplePublisher publisher;
	
	@GetMapping("/publish/{message}")
	public ResponseEntity<?> publishMessage(@PathVariable String message){
		
		try {
			
			for(int i=1;i<20;i++) {
			publisher.sendSampleMsg(message+":"+i);
			}
			return ResponseEntity.ok("message published");
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
