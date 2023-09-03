package kafka.springboot.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	
	
	@KafkaListener(topics = "myjlctopic",groupId = "myjlc_group", containerFactory = "stringkaListenerContainerFactory")	
	public void processMassage(String msg) {		
		System.out.println(" Message Received from kafka Server :: "+msg);
		
	}

}
