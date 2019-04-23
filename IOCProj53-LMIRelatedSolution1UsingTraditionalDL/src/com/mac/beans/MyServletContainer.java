package com.mac.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServletContainer {
	private RequestHandler handler;
	private ApplicationContext ctx;
	private String beanId;
	
	public MyServletContainer(String beanId) {
		System.out.println("MyServletContainer: 1-param constructor");
		this.beanId = beanId;
	}
	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}
	public void processRequest(String data) {
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		handler = ctx.getBean(beanId, RequestHandler.class);
		handler.handle(data);
	}
}
