package com.event.listener;

import com.event.listener.codingPractice.RunPracticeCode;
import com.event.listener.config.TwilioConfig;
import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan("com.event.listener")
@EnableAsync
@EnableAspectJAutoProxy
public class ListenerApplication {

	@Autowired
	private TwilioConfig twilioConfig;

	static int i;

	@PostConstruct
	public void twilioInit(){
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ListenerApplication.class, args);
		RunPracticeCode code = context.getBean(RunPracticeCode.class);
		code.runPracticeCode();
		System.out.println("static int default value : "+ i);

	}

}
