package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class P23p260303Application {

    public static void main(String[] args) {
        SpringApplication.run(P23p260303Application.class, args);
    }

}
