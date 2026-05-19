package com.schedulando.schedulando;

import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;


@Component
public class ScheduledJob {

    private static final Logger logger = LoggerFactory.getLogger(ScheduledJob.class);
    //ini variavel
    private int executionCount = 0;

    @Scheduled(fixedRate = 5000)
    public void monitorSystem() {
        //contador
        executionCount++;

        //logs
        logger.info("Scheduler started");
        logger.info("Execution number: {}", executionCount);
        logger.info("Date and Hour: {}", LocalDateTime.now());

        //tente
        try {
            //se execution for igual a 5
            if (executionCount == 5) {
                //lance uma execetion com a mensagem fake...
                throw new RuntimeException("Fake system error");

            }
            //senao informa task executed s...
            logger.info("Task executed sucessfully");
            //capture a execption
        } catch (Exception e) {
            //e log o erro
            logger.error(
                    //a getMessage no caso é a que ta no RunTime do if
                    "Error while executing scheduler: {}", e.getMessage()
            );
        }
        //separador pro proximo log
        logger.info("--------------------------------");
    }
}
