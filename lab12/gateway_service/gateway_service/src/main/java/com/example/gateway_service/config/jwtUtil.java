package com.example.gateway_service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.security.Key;

@Component
public class jwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private Key key;
    @PostConstruct
    public void init(){
        this.key = Keys.hmacShakeyfor
    }
}
