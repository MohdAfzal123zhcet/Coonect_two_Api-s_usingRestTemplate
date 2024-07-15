package com.example.atm1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class atmController {

    @Autowired
    RestTemplate x;
    @GetMapping("/checkbalance")
    public Integer checkbalance()
    {
        String url ="http://localhost:8080/getbalance";

        Integer bal=x.getForObject(url,Integer.class);
        return bal;

    }
}