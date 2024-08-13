package com.event.listener;

import com.event.listener.config.AppConfig;
import com.event.listener.publisher.ZeeCafePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.event.listener")
public class ListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ZeeCafePublisher bean = context.getBean("zeeCafePublisher", ZeeCafePublisher.class);
		bean.streamBigBangTheory("EP-001");
		bean.streamComedyShow("EP-006");
	}

}
