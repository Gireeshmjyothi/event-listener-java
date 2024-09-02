package com.event.listener.eventListener;

import com.event.listener.config.TwilioConfig;
import com.event.listener.events.TransactionFailure;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SMSListener {

    @Autowired
    private TwilioConfig twilioConfig;

    @EventListener
    @Async
    public void sendSMS(TransactionFailure transactionFailure){
        try{
            System.out.println("Sending sms +91 5304520544");
            PhoneNumber to = new PhoneNumber("+91 5304520544");
            PhoneNumber from = new PhoneNumber(twilioConfig.getTrailNumber());
            Message.creator(
                            to,
                            from,
                            "Dear Customer your transaction has been failed due to some technical issue \n please try after some time \n"
                                    + "account number is : " + transactionFailure.getAccountNumber()+"****")
                    .create();
            System.out.println("SMS sent successfully.");
        }catch (Exception ex){
            log.error("Error while sending sms {}", ex.getMessage());
        }
    }
}
