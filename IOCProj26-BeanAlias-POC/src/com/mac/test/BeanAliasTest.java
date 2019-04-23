package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.ITCompany;

public class BeanAliasTest {
	public static void main(String[] args) {
		ITCompany com1 = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
								"com/mac/cfgs/applicationContext.xml")){
			com1 = context.getBean("itc", ITCompany.class);
			System.out.println(com1);
			
			com1 = context.getBean("com", ITCompany.class);
			System.out.println(com1);
			
			com1 = context.getBean("cell", ITCompany.class);
			System.out.println(com1);
			
			com1 = context.getBean("mac", ITCompany.class);
			System.out.println(com1);
			
			com1 = context.getBean("window", ITCompany.class);
			System.out.println(com1);
		}//try
	}//main
}//class
