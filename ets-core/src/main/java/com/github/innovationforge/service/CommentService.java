package com.github.innovationforge.service;

import com.github.innovationforge.model.Comment;
import com.github.innovationforge.model.Tweet;

import java.util.List;

public interface CommentService {
    Comment createComment(Comment comment);

    List<Comment> getCommentsByTweet(Tweet tweet);
}
