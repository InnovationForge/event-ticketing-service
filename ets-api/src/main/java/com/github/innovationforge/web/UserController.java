package com.github.innovationforge.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<?> createNewUserAccount() {
        return ResponseEntity.ok().body("Creates a new user account successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<?> AuthenticateUserAndGenerateAccessToken() {
        return ResponseEntity.ok().body("Authenticates a user and generates an access token successfully");
    }
    @GetMapping("/profile")
    public ResponseEntity<?> retrieveProfileOfAuthenticatedUser() {
        return ResponseEntity.ok().body("Retrieves the profile information of the authenticated user successfully");
    }
    @PutMapping("/profile")
    public ResponseEntity<?> UpdateProfileOfAuthenticatedUser() {
        return ResponseEntity.ok().body("Updates the profile information of the authenticated user successfully");
    }
    @PostMapping("/reset-password")
    public ResponseEntity<?> resetUserPassword() {
        return ResponseEntity.ok().body("Initiates the process for resetting a user's password successfully");
    }
    @PutMapping("/reset-password")
    public ResponseEntity<?> updateUserPassword(@PathVariable String eventId) {
        log.info("event id : "+eventId);
        return ResponseEntity.ok().body("Updates the user's password after password reset successfully");
    }
}
