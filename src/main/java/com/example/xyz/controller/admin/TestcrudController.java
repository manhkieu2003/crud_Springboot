package com.example.xyz.controller.admin;

import com.example.xyz.entity.User;
import com.example.xyz.repository.Userrepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class TestcrudController {
    @Autowired
    Userrepsitory userrepsitory;
    @GetMapping("/list")
    public List<User> list()
    {
        return userrepsitory.findAll() ;
    }
}
