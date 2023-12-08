package com.twitter.tweets.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
public class Tweet {
    private Long id;
    private String userName;
    private String content;
    private ZonedDateTime dateCreated;
}
