package com.example.xyz.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginForm()
    {
        return "/auth/login";
    }
    @PostMapping("/login")
    public String login(
            @RequestParam("email") String email,
            @RequestParam("password") String password

    )
    {
        System.out.println(email);
        System.out.println(password);
         return "redirect:/login";
    }
}
