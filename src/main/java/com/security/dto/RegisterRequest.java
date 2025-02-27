package com.security.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @Valid

    @NotNull(message =  " first name should not be null")
    @NotBlank(message =  " first name should not be null")
    private String firstname;
    @NotNull
    private String lastname;
    @Email
    private String email;
    private String password;

}
