package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Student;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Student st = null;
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		st = ctx.getBean("st", Student.class);
		System.out.println(st);
		((AbstractApplicationContext) ctx).close();
	}
}
