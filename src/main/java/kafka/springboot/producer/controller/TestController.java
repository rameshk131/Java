package kafka.springboot.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kafka.springboot.producer.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@GetMapping("/producer")
	public String produceMessage() {		
		System.out.println("produceMessage called.............");		
		return testService.sendMassage("Saraswati Kumari, How are you ?");	
		
	}

}
