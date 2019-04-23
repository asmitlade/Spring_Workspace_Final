package com.mac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.mac.bean.WishMessageGenerator;
import com.mac.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMessageGenerator generator = null;
		ctx = SpringApplication.run(DemoApplication.class, args);
		generator = ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println(generator.generateWishMessage("Asmit Lade"));
		((ConfigurableApplicationContext) ctx).close();
	}

}
