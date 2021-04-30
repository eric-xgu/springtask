package com.xugu.task;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Component
public class TaskJob01 {
    private SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /*定时任务方法*/
    @Scheduled(cron="0/2 * * * * ?")
    public void job3(){
        System.out.println("任务3:"+df.format(new Date()));
    }
    @Scheduled(cron = "0/3 * * * * ?")
    public void job4(){
        System.out.println("任务4:"+df.format(new Date()));
    }
}