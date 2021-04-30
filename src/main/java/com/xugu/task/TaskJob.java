package com.xugu.task;


import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Component
public class TaskJob {
    private SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /*定时任务方法*/

    public void job(){
        System.out.println("任务1:"+df.format(new Date()));
    }
    public void job2(){
        System.out.println("任务2:"+df.format(new Date()));
    }
}
