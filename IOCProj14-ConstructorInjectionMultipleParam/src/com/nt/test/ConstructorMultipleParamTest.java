package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ConstructorMultipleParam3;

public class ConstructorMultipleParamTest {

	public static void main(String[] args) {
		ConstructorMultipleParam3 cmp;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
							("com/nt/cfgs/applicationContext.xml")) {
			cmp = context.getBean("cmp4", ConstructorMultipleParam3.class);
			System.out.println(cmp);
		}//try
	}//main
}//class