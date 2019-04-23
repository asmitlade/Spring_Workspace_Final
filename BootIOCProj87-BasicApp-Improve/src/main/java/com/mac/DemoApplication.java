package com.mac;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	
	@Bean
	public Calendar createCalendar() {
		return Calendar.getInstance();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMessageGenerator generator = null;
		ctx = SpringApplication.run(DemoApplication.class, args);
		generator = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(generator.generateWishMessage("Asmit Lade"));
		((ConfigurableApplicationContext) ctx).close();
	}

}
