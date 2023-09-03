package kafka.springboot.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyKafkaProducerApplication.class, args);
		
		System.out.println("running...........");
	}

}
