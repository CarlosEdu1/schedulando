package com.schedulando.schedulando;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class ScheduledJob {

    @Scheduled(cron = "25,37,59 21 22 * * *")
    public void execute() throws InterruptedException{
        System.out.println("Running: " + LocalTime.now());
    }

    //segundo, minuto, hora
}
