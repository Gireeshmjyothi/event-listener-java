package com.event.listener;

import com.event.listener.config.AppConfig;
import com.event.listener.config.TwilioConfig;
import com.event.listener.publisher.GooglePay;
import com.event.listener.publisher.ZeeCafePublisher;
import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan("com.event.listener")
@EnableAsync
public class ListenerApplication {

	@Autowired
	private TwilioConfig twilioConfig;

	@PostConstruct
	public void twilioInit(){
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}
	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);
	}
}
