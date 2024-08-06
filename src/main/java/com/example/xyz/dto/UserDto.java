package com.example.xyz.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @NotNull
    private Integer id;
    @NotNull
    @NotBlank
    private String username;
    @NotNull
    @NotBlank
    private String password;
    @NotNull
    @NotBlank
    @Email
    private String email;
//    @NotNull
//    @NotBlank
    private String photo;


//    @NotNull
    private Integer activated;
//    @NotNull
    private Integer admin;


}
