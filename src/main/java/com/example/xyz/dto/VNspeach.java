package com.example.xyz.dto;

import com.example.xyz.Config.Speach;
import org.springframework.stereotype.Component;

@Component
 public class VNspeach implements Speach {

    @Override
    public void sayGreeting() {
        System.out.println("xin chào mọi người");
    }
}
