package com.schedulando.schedulando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulandoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulandoApplication.class, args);
    }
}
