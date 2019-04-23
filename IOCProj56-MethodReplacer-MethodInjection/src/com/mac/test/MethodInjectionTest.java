package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.service.BankLoanService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		BankLoanService bank=null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			bank = ctx.getBean("bank", BankLoanService.class);
			System.out.println(bank.calIntrAmount(10000, 3));
		}//try
	}//main
}//class
