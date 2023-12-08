package com.twitter.tweets.infraestracture.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostTweetRequest {
    @NonNull
    String content;
}
