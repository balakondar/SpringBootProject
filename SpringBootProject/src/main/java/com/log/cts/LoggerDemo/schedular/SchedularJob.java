/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.log.cts.LoggerDemo.schedular;

import java.time.LocalTime;
import java.time.ZoneId;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author 91996
 */
@Component
public class SchedularJob {
    
    @Scheduled(cron = "0/30 * * ? * *")
    public void runScheduledJob(){
        System.out.println("Job Run at "+ LocalTime.now());
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("Output of systemDefault()-" +zone);
        ZoneId zoneId  = ZoneId.of("Asia/Calcutta");
        System.out.println("Output of zoneid obtained using of function: "+ zoneId);
    }
    
}
