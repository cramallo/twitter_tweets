package com.twitter.tweets.infraestracture.controllers.response;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.ZonedDateTime;

@Value
@AllArgsConstructor
public class PostTweetResponse {
    String userName;
    String content;
    ZonedDateTime dateCreated;
}
