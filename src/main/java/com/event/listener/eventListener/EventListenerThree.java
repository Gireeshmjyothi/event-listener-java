package com.event.listener.eventListener;

import com.event.listener.events.ComedyShow;
import com.event.listener.events.TheBigBangTheoryEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerThree {
    public void watchComedyShow(String eps){
        System.out.println("Joi started watching Comedy Show");
        System.out.println("Playing  comedy show: " + eps);
    }
    @EventListener
    public void listenToEvent(ComedyShow event) {
        watchComedyShow(event.getEpisodeNo());
    }
}
