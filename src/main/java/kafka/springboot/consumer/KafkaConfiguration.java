package kafka.springboot.consumer;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;


@Configuration
public class KafkaConfiguration {
	
	
	 @Bean
	public ConsumerFactory<String, String> stringConsumerFactory(){
		 
		 Map<String,Object> config = new HashMap<>();
		 config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		 config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		 config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		 config.put(ConsumerConfig.GROUP_ID_CONFIG, "myjlc_group");
		 config.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");		 
		 return new DefaultKafkaConsumerFactory<>(config);
		
	}
	 @Bean(value = "stringkaListenerContainerFactory")
	 public ConcurrentKafkaListenerContainerFactory<String, String> stringkaListenerContainerFactory(){
		 
		 ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
		 factory.setConsumerFactory(stringConsumerFactory());
		 
		 return factory;
		 
	 }
	
	

}
