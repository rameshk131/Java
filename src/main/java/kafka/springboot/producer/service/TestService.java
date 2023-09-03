package kafka.springboot.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private KafkaTemplate<String, String> stringKafkaTemp;
	
	public String sendMassage(String msg) {		
		stringKafkaTemp.send("myjlctopic", msg);		
		return "Message produces successfully....";
	}

}
