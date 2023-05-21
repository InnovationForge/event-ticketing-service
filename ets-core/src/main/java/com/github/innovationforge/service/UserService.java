package com.github.innovationforge.service;

import com.github.innovationforge.model.User;

import java.util.Optional;

public interface UserService {
    User createUser(User user);
    Optional<User> findUserByUsername(String username);
}
