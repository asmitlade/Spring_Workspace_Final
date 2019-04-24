package com.mac.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.mac.beans.FlipKart;
import com.mac.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class BootIocProj88StrategyPatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		FlipKart fpkt = null;
		ctx = SpringApplication.run(BootIocProj88StrategyPatternApplication.class, args);
		fpkt = ctx.getBean("fpkt", FlipKart.class);
		System.out.println(fpkt.shopping(new String[] {"Sun Glass","Blezzer","Sherwani","Shooes"}));
	}
}
