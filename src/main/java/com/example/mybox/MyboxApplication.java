package com.example.mybox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyboxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyboxApplication.class, args);
    }
}
