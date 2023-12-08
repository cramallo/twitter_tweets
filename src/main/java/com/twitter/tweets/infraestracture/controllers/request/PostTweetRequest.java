package com.twitter.tweets.infraestracture.controllers.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostTweetRequest {
    @NonNull
    @Size(min = 1, max = 280)
    private String content;
}
