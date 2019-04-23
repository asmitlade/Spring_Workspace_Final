package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Viechle;

public class DependencyLookupTest {
	public static void main(String[] args) {
		Viechle viechle = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
									"com/mac/cfgs/applicationContext.xml")){
			viechle = ctx.getBean("veichle", Viechle.class);
			viechle.move("Hyderabad", "Banglore");
		}//try
	}//main
}//class
