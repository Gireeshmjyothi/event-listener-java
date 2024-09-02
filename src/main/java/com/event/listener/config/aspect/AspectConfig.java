package com.event.listener.config.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {

    @Before("execution(* com.event.listener.publisher.GooglePay.sendMoney(..))")
    public void printBefore(){
        System.out.println("Validate before sending money to the user.");
    }

    @After("execution(* com.event.listener.publisher.GooglePay.sendMoney(..))")
    public void printAfter(){
        System.out.println("After transaction.");
    }



}
