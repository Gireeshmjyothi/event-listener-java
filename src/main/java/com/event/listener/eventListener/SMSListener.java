package com.event.listener.eventListener;

import com.event.listener.events.TransactionFailure;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class SMSListener {

    @EventListener
    @Async
    public void sendSMS(TransactionFailure transactionFailure){
        System.out.println("Sending SMS body \n" +
        "Hi " +  transactionFailure.getName() +"\n" + "Transaction has been failed with amount :" + transactionFailure.getAmount());
    }
}
