package com.twitter.tweets.infraestracture.repositories.adapters;

import com.twitter.tweets.domain.Tweet;
import com.twitter.tweets.infraestracture.entities.TweetEntity;

public class TweetEntityAdapter {
    public static TweetEntity buildFromTweetDomain(final Tweet tweet) {
        return TweetEntity.builder()
                .userName(tweet.getUserName())
                .content(tweet.getContent())
                .dateCreated(tweet.getDateCreated())
                .build();
    }
}
