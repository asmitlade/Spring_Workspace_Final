package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Student;

public class SpelXMLTest {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		Student st = null;
		// create Container object
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		//get bean
		st = ctx.getBean("st", Student.class);
		System.out.println(st);
		//close ctx object
		((AbstractApplicationContext) ctx).close();
	}
}
