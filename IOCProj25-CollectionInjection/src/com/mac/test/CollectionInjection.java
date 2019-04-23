package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Institute;

public class CollectionInjection {

	public static void main(String[] args) {
		Institute ins = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mac/cfgs/applicationContext.xml")){
			ins = context.getBean("inst", Institute.class);
			System.out.println(ins);
		}//try
	}//main
}//class
