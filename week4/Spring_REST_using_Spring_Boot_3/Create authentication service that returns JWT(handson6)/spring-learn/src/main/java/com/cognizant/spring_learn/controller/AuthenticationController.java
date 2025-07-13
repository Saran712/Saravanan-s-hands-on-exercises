package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        // Basic base64encoded(username:password)
        String encodedCredentials = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(encodedCredentials));
        String[] userDetails = decoded.split(":", 2);

        String username = userDetails[0];
        String password = userDetails[1];

        // In real app, verify credentials using DB or auth service.
        if (username.equals("user") && password.equals("pwd")) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
