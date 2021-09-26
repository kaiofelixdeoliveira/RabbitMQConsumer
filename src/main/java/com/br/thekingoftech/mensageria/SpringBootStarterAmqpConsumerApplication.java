package com.br.thekingoftech.mensageria;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class SpringBootStarterAmqpConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterAmqpConsumerApplication.class, args);
	}

}
