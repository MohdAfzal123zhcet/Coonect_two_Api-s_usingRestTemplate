package com.example.bankapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class bankController {

    @GetMapping("/getbalance")
    public int getbalance()
    {
        return 100;
    }
}