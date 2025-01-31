package com.security.authController;

import com.security.dto.AuthenticationRequest;
import com.security.dto.AuthenticationResponse;
import com.security.dto.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    //Register the user in to the application
    @PostMapping("/resgister")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        AuthenticationResponse response = service.register(request);
        System.out.println(response);
        return ResponseEntity.ok(response);

    }
    // Api to authenticate the user and generate the token for the consequent requests
    @PostMapping("/authentication")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){

        AuthenticationResponse response = service.authenticate(request);
        return ResponseEntity.ok(response);
    }
}
