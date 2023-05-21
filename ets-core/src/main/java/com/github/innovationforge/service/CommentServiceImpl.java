package com.github.innovationforge.service;

import com.github.innovationforge.model.Comment;
import com.github.innovationforge.model.Tweet;
import com.github.innovationforge.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository;

    @Override
    public Comment createComment(Comment comment) {
        comment.setCreatedAt(new Date());
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getCommentsByTweet(Tweet tweet) {
        return commentRepository.findByTweetOrderByCreatedAtDesc(tweet);
    }

    // Other service methods omitted for brevity
}