package com.github.innovationforge.service;

import com.github.innovationforge.model.Tweet;
import com.github.innovationforge.model.User;

import java.util.List;

public interface TweetService {
    Tweet createTweet(Tweet tweet);

    List<Tweet> getTweetsByUser(User user);
}
