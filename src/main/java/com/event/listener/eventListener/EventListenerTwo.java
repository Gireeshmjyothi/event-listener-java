package com.event.listener.eventListener;

import com.event.listener.events.TheBigBangTheoryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerTwo {
    public void watchBigBangTheory(String eps){
        System.out.println("Willy started watching BBT");
        System.out.println("Playing BTT : " + eps);
    }

    @EventListener
    public void listenToEvent(TheBigBangTheoryEvent event) {
        watchBigBangTheory(event.getEpisodeNo());
    }
}
