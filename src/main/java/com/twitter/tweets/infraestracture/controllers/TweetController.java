package com.twitter.tweets.infraestracture.controllers;

import com.twitter.tweets.application.TweetService;
import com.twitter.tweets.application.SaveTweetDto;
import com.twitter.tweets.infraestracture.controllers.request.PostTweetRequest;
import com.twitter.tweets.infraestracture.controllers.response.PostTweetResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweet")
@AllArgsConstructor
public class TweetController {

    private TweetService tweetService;

    @PostMapping
    public PostTweetResponse postTweet(@RequestHeader("user_name") final String userName,
                                       @Valid @RequestBody PostTweetRequest createTweetRequest) {

        final var savedTweet = tweetService.saveTweet(
                new SaveTweetDto(userName, createTweetRequest.getContent())
        );

        return new PostTweetResponse(
                userName,
                savedTweet.getContent(),
                savedTweet.getDateCreated()
        );
    }
}
