package com.security.authController;

import com.security.dto.AuthenticationRequest;
import com.security.dto.AuthenticationResponse;
import com.security.dto.RegisterRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    //Register the user in to the application
    @PostMapping("/resgister")
    public ResponseEntity<AuthenticationResponse> register(
           @Valid @RequestBody RegisterRequest request
    ){
        System.out.println("printing ...");
        AuthenticationResponse response = service.register(request);
        System.out.println(response);
        return ResponseEntity.ok(response);

    }
    // Api to authenticate the user and generate the token for the consequent requests.
    @PostMapping("/authentication")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){

        AuthenticationResponse response = service.authenticate(request);
        return ResponseEntity.ok(response);
    }

/*    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleFieldValidation(MethodArgumentNotValidException ex){

        Map<String, String> errors  = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error)-> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName,errorMessage);
        });
        return  errors;
    }*/
}
