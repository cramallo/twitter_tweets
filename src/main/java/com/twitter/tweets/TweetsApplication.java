package com.twitter.tweets;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class TweetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TweetsApplication.class, args);
	}

}
