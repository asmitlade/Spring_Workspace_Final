package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Alarm;

public class FactoryBeanTest {
	public static void main(String[] args) {
		Alarm alarm = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			alarm = ctx.getBean("alarm", Alarm.class);
			System.out.println(alarm.remainder());
		}//try
	}//main
}//class
