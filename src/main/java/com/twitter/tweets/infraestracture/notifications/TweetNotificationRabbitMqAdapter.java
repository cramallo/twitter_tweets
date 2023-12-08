package com.twitter.tweets.infraestracture.notifications;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twitter.tweets.application.TweetNotificationGateway;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class TweetNotificationRabbitMqAdapter implements TweetNotificationGateway {

    private AmqpTemplate amqpTemplate;
    private ObjectMapper objectMapper;

    @Override
    public void send(final Object payload) {
        try {
            amqpTemplate.convertAndSend(
                    "tweet-events-exchange",
                    "tweet-events-routing-key",
                    objectMapper.writeValueAsString(payload)
            );
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
