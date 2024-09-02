package com.event.listener.publisher;

import com.event.listener.events.ComedyShow;
import com.event.listener.events.TheBigBangTheoryEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ZeeCafePublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void streamBigBangTheory(String episodeNo){
        System.out.println("Zee Cafe Started BBT Episode: " + episodeNo);
        applicationEventPublisher.publishEvent(new TheBigBangTheoryEvent(episodeNo));
    }

    public void streamComedyShow(String episodeNo){
        System.out.println("Zee Cafe Started Comedy Show Episode: " + episodeNo);
        applicationEventPublisher.publishEvent(new ComedyShow(episodeNo));
    }
}
