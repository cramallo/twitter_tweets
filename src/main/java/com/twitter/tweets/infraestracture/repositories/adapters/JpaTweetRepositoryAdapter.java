package com.twitter.tweets.infraestracture.repositories.adapters;

import com.twitter.tweets.domain.Tweet;
import com.twitter.tweets.domain.TweetRepository;
import com.twitter.tweets.infraestracture.repositories.JpaTweetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.twitter.tweets.infraestracture.repositories.adapters.TweetAdapter.buildTweetFromEntity;
import static com.twitter.tweets.infraestracture.repositories.adapters.TweetEntityAdapter.buildFromTweetDomain;

@Service
@AllArgsConstructor
public class JpaTweetRepositoryAdapter implements TweetRepository {

    private JpaTweetRepository tweetRepository;

    @Override
    public Tweet save(final Tweet tweet) {
        final var savedTweetEntity =  tweetRepository.save(buildFromTweetDomain(tweet));
        return buildTweetFromEntity(savedTweetEntity);
    }
}
