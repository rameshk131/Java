package kafka.springboot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyKafkaConsumerApplication.class, args);
		
		System.out.println("running...........");
	}

}
