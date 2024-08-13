package com.event.listener.publisher;

import com.event.listener.events.ComedyShow;
import com.event.listener.events.TheBigBangTheoryEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ZeeCafePublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void streamBigBangTheory(String episodeNo){
        System.out.println("Zee Cafe Started BBT Episode: " + episodeNo);
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(episodeNo));
    }

    public void streamComedyShow(String episodeNo){
        System.out.println("Zee Cafe Started Comedy Show Episode: " + episodeNo);
        applicationEventPublisher.publishEvent(new ComedyShow(episodeNo));
    }
}
