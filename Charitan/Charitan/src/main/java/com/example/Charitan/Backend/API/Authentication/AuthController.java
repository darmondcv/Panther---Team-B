package com.example.Charitan.Backend.API.Authentication;

import com.example.Charitan.Backend.API.Authentication.AuthService;
import com.example.Charitan.Backend.DTO.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // Login endpoint
    @PostMapping("/login")
    public ResponseEntity<String> login (@RequestBody LoginRequest loginRequest){
        boolean isAuthenticated = authService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());

        if(isAuthenticated){
            return ResponseEntity.ok("User " + loginRequest.getEmail() + "logged in");
        } else {
            return ResponseEntity.status(401).body("Invalid Email");
        }
    }
}
