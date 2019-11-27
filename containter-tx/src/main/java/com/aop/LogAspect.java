package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.service..*.*(..))")
    public void mypiontcut(){

    }
    //before 通知
    @Before("mypiontcut()")
    public void before(){
        System.out.println("准备删除！");
    }

}
