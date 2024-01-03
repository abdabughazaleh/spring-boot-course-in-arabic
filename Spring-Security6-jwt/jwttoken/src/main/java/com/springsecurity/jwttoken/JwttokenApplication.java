package com.springsecurity.jwttoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class JwttokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwttokenApplication.class, args);
    }

}
