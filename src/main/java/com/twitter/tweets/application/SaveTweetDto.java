package com.twitter.tweets.application;


import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class SaveTweetDto {
    String userName;
    String content;
}
