package com.example.registrationLoginDemo.service.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginPageRequest {

    @Size(min = 1, message = "You need fill this area")
    private String email ;

    @Size(min = 1, message = "You need fill this area")
    private String password ;

}
