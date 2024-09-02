package com.event.listener.eventListener;

import com.event.listener.events.TransactionFailure;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @EventListener
    @Async
    public void sendEmail(TransactionFailure transactionFailure){
        System.out.println("send email method invoked");
        try {
            Thread.sleep(6000);
            System.out.println("Sending Email body \n" +
                    "Hi.," +  transactionFailure.getName() +"\n" + "Transaction has been failed with amount :" + transactionFailure.getAmount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("send email method ended");
    }
}
