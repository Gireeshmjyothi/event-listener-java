package com.event.listener.eventListener;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextListener {

    @EventListener
    public void handleRefreshedEvent(ContextRefreshedEvent contextRefreshedEvent){
        System.out.println("Application initialised or refreshed");
        System.out.println(contextRefreshedEvent);
    }

    @EventListener
    public void handleStartEvent(ContextStartedEvent contextStartedEvent){
        System.out.println("Application initialised and start()");
        System.out.println(contextStartedEvent);
    }

    @EventListener
    public void handleStoppedEvent(ContextStoppedEvent contextStoppedEvent){
        System.out.println("Application stopped");
        System.out.println(contextStoppedEvent);
    }

    @EventListener
    public void handleClosedEvent(ContextClosedEvent contextClosedEvent){
        System.out.println("Application closed");
        System.out.println(contextClosedEvent);
    }
}
