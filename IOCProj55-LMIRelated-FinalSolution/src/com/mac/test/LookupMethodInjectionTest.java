package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.MyServletContainer;

public class LookupMethodInjectionTest {

	public static void main(String[] args) {
		MyServletContainer msc = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			msc = ctx.getBean("msc", MyServletContainer.class);
			msc.processRequest("Asmit");
			msc.processRequest("Mac");
		}//try
	}//main
}//class
