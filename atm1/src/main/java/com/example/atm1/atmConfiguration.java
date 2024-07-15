package com.example.atm1;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class atmConfiguration {

    public class atmConfiguation {

        @Bean
        public RestTemplate xyz(RestTemplateBuilder restTemplateBuilder)
        {
            return restTemplateBuilder.build();
        }
    }

}