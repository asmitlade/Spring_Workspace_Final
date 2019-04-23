package com.mac.beans;

import org.springframework.context.ApplicationContext;

public class Viechle {
	private String beanId;
	public Viechle(String beanId) {
		System.out.println("Viechle:0-param contructor");
		this.beanId = beanId;
	}
	public void startEntertainment() {
		System.out.println("start Entertainment");
	}
	public void soundHorn() {
		System.out.println("sound horn");
	}
	public void move(String start, String dest, ApplicationContext ctx) {
		Engine engine = null;
		//call Engine class method
		engine = ctx.getBean(beanId, Engine.class);
		engine.start();
		System.out.println("your journey completed from ::"+start+" to "+dest);
		engine.stop();
	}
}
