package com.github.innovationforge.service;

import com.github.innovationforge.model.Tweet;
import com.github.innovationforge.model.User;
import com.github.innovationforge.repository.TweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TweetServiceImpl implements TweetService {
    private TweetRepository tweetRepository;

    @Override
    public Tweet createTweet(Tweet tweet) {
        tweet.setCreatedAt(new Date());
        return tweetRepository.save(tweet);
    }

    @Override
    public List<Tweet> getTweetsByUser(User user) {
        return tweetRepository.findByUserOrderByCreatedAtDesc(user);
    }

    // Other service methods omitted for brevity
}