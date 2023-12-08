package com.twitter.tweets.infraestracture.repositories.adapters;

import com.twitter.tweets.domain.Tweet;
import com.twitter.tweets.infraestracture.entities.TweetEntity;

public class TweetAdapter {
    public static Tweet buildTweetFromEntity(final TweetEntity tweetEntity) {
        return Tweet.builder()
                .id(tweetEntity.getId())
                .userName(tweetEntity.getUserName())
                .content(tweetEntity.getContent())
                .dateCreated(tweetEntity.getDateCreated())
                .build();
    }
}
