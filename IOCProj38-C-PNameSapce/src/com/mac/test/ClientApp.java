package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Employee;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Employee emp = null;
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		emp = ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		((AbstractApplicationContext) ctx).close();
	}//main
}//class