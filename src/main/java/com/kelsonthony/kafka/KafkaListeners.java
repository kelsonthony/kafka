package com.kelsonthony.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class KafkaListeners {

	@KafkaListener(
			topics = "kelsonthony",
			groupId = "groupId"
	)
	public void listener(String data) {
		data = "Hello data";
		
	}
	
	
}
