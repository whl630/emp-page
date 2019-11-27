package com.test;

import com.service.StuAndEmpManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void studentTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        StuAndEmpManager stuAndEmpManager = context.getBean("service",StuAndEmpManager.class);
        stuAndEmpManager.toRunning(6);
    }
}
