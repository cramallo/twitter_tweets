package com.twitter.tweets.application;

import org.springframework.stereotype.Service;

@Service
public interface TweetNotificationGateway<T> {
    void send(T payload);
}
