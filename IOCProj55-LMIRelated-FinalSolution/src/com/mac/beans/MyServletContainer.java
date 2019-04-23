package com.mac.beans;

public abstract class MyServletContainer {
	private RequestHandler handler;
	
	public MyServletContainer() {
		System.out.println("MyServletContainer: 0-param constructor");
	}
	
	public abstract RequestHandler getRequestHandler();
	
	public void processRequest(String data) {
		//get dependent bean
		handler = getRequestHandler();
		handler.handle(data);
	}
}
