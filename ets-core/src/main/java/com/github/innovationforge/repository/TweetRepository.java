package com.github.innovationforge.repository;

import com.github.innovationforge.model.Tweet;
import com.github.innovationforge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    List<Tweet> findByUserOrderByCreatedAtDesc(User user);
}