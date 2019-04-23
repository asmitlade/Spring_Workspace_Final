package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.WishMsgGenerator;

public class InjectAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMsgGenerator wish = null;
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		wish = ctx.getBean("wmg", WishMsgGenerator.class);
		System.out.println(wish.generate("Asmit Lade"));
		((AbstractApplicationContext) ctx).close();
	}//main
}//class