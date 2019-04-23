package com.mac.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx = null;
	
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
	public void move(String start, String dest) {
		Engine engine = null;
		//call Engine class method
		engine = ctx.getBean(beanId, Engine.class);
		engine.start();
		System.out.println("your journey completed from ::"+start+" to "+dest);
		engine.stop();
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Viechle.setApplicationContext()");
		this.ctx =ctx;
	}
}
