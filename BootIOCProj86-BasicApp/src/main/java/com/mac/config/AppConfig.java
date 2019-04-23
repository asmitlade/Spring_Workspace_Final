package com.mac.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mac.bean")
public class AppConfig {

	@Bean
	public Calendar createCalendar() {
		return Calendar.getInstance();
	}
}
