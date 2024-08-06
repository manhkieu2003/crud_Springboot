package com.example.xyz.controller.admin;

import com.example.xyz.Config.Speach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpeachController {
    @Autowired
     Speach speach;
    @GetMapping("/speach/hello")
    public void hello()
    {
       speach.sayGreeting();
    }
}
