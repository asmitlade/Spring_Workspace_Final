package com.mac.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware{
	private RequestHandler handler;
	private String beanId;
	private ApplicationContext ctx;
	
	public MyServletContainer() {
		System.out.println("MyServletContainer: 0-param constructor");
	}
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public void processRequest(String data) {
		//get dependent bean
		handler = ctx.getBean(beanId, RequestHandler.class);
		handler.handle(data);
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}
	
	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}
}
