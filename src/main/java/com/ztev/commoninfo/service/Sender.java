package com.ztev.commoninfo.service;

//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;


/*
@Component
public class Sender {

	@Autowired
	private AmqpTemplate amqpTemlate;
	
	@Autowired
	private RabbitMessagingTemplate rabbitMessagingTemplate;

	public void send() throws Exception {
		String context = "hello" + new Date();
		System.out.println("Sender:" + context);
		this.amqpTemlate.convertAndSend("hello", context);
	}
	
	public void send(City city) {
		this.rabbitMessagingTemplate.convertAndSend("hello", city);
	}
}
*/
