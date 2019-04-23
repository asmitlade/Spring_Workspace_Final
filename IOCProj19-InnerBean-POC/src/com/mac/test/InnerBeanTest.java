package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Cricketer;

public class InnerBeanTest {

	public static void main(String[] args) {
		Cricketer ckt = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			ckt = context.getBean("ckt", Cricketer.class);
			System.out.println(ckt);
		}//try
	}//main
}//class