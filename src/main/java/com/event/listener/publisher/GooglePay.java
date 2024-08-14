package com.event.listener.publisher;

import com.event.listener.events.TransactionFailure;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GooglePay {

    private final ApplicationEventPublisher applicationEventPublisher;

    public String sendMoney(String name, double amount, boolean condition){

        try {
            if(condition){
                throw new RuntimeException("Transaction failed.");
            }
            System.out.println("Hi : "+ name);
            System.out.println("Amount : "+ amount);
            System.out.println("Money has been sent successfully.");
        }catch (Exception exp){
            applicationEventPublisher.publishEvent(new TransactionFailure(name, amount));
            return "Transaction failed.";
        }
        return "Money sent successfully";
    }
}
