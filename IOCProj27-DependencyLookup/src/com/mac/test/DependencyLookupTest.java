package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.ProffessionalCricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		ProffessionalCricketer pc = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
											"com/mac/cfgs/applicationContext.xml")){
			pc = context.getBean("ckt", ProffessionalCricketer.class);
			pc.batting();
			pc.bowling();
			pc.fielding();
		}//try
	}//main
}//class