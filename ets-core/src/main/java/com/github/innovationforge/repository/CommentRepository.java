package com.github.innovationforge.repository;

import com.github.innovationforge.model.Comment;
import com.github.innovationforge.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTweetOrderByCreatedAtDesc(Tweet tweet);
}