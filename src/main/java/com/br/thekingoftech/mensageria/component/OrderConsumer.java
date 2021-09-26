package com.br.thekingoftech.mensageria.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
 
    @RabbitListener(queues = {"${queue.order.name}"})
    public void receive(@Payload String order) {
    	LOG.info("Order: " + order);
    }
}
