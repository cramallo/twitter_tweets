package com.twitter.tweets.application;


import com.twitter.tweets.domain.Tweet;
import com.twitter.tweets.domain.TweetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static java.time.ZonedDateTime.now;

@Service
@AllArgsConstructor
public class TweetService {

    private TweetRepository tweetRepository;
    private TweetNotificationGateway<Tweet> tweetNotificationGateway;

    public Tweet saveTweet(final SaveTweetDto saveTweetDto) {
        final var tweet = Tweet.builder()
                .userName(saveTweetDto.getUserName())
                .content(saveTweetDto.getContent())
                .dateCreated(now())
                .build();

        final var savedTweet = tweetRepository.save(tweet);

        tweetNotificationGateway.send(savedTweet);

        return savedTweet;
    }
}
