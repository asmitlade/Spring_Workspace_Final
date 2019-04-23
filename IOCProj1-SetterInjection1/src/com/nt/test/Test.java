package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.hello.HelloWorld;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/nt/cfgs/applicationContext.xml");
		HelloWorld hw = (HelloWorld)context.getBean("hw");
		hw.getMsg();
	}

}
