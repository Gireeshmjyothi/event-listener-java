package com.event.listener.publisher;

import com.event.listener.events.TransactionFailure;
import com.event.listener.model.request.GooglePayRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GooglePay {

    private final ApplicationEventPublisher applicationEventPublisher;
    int num;

    public String sendMoney(GooglePayRequest googlePayRequest){
        try {
            System.out.println("number :: " + num);
            if (googlePayRequest.isCondition()) {
                throw new RuntimeException("Transaction failed.");
            }
            System.out.println("Hi..: " + googlePayRequest.getName());
            System.out.println("Amount : " + googlePayRequest.getAmount());
            System.out.println("Money has been sent successfully.");


        }catch (Exception exp){
            applicationEventPublisher.publishEvent(new TransactionFailure(googlePayRequest.getName(), googlePayRequest.getAmount(), googlePayRequest.getAccountNumber()));
            return "Transaction failed.";
        }finally {
            System.out.println("executing finally bock.");
        }
        return "Money sent successfully";
    }
}
