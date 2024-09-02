package com.event.listener.codingPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer computer;

    public void build(){
        System.out.println("Hello world!!");
        computer.compile();
    }
}
