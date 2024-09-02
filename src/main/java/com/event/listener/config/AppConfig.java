package com.event.listener.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
@ComponentScan("com")
public class AppConfig {

    // this one of the way we can make event as async or by annotation
//    @Bean("simpleApplicationEventMulticaster")
//    public ApplicationEventMulticaster makeEventAsAsync(){
//        SimpleApplicationEventMulticaster simpleApplicationEventMulticaster = new SimpleApplicationEventMulticaster();
//        simpleApplicationEventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//        return simpleApplicationEventMulticaster;
//    }
}
