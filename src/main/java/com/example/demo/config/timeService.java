package com.example.demo.config;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by yeyu on 2018/12/10.
 * 描述：
 */
//@Service
//@EnableScheduling

public class timeService {
    @Scheduled(cron="0,20,40 * * * * 0-7")
    public void timer(){
        ConcurrentTaskScheduler cd=new ConcurrentTaskScheduler();
        /*cd.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("111111111111111");
            }
        },1000);*/
        cd.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        }, new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                Calendar c=Calendar.getInstance();
                c.set(Calendar.MINUTE,c.get(Calendar.MINUTE)+2);
                return c.getTime();
            }
        });
       // System.out.println("哈哈哈哈哈哈");
    }
}
