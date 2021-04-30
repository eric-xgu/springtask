package com.xugu;

import com.xugu.task.TaskJob;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //获取spring上下文环境
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        TaskJob ts=(TaskJob) ac.getBean("taskJob");

    }
}
