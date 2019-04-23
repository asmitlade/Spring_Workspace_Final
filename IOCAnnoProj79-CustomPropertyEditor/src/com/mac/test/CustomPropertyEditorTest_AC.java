package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.BankLoanDept;

public class CustomPropertyEditorTest_AC {

	public static void main(String[] args) {
		BankLoanDept loanDept = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			loanDept = ctx.getBean("loanDept", BankLoanDept.class);
			System.out.println("Simple Loan Interest Amount ::"+loanDept.calIntAmt());
		}//try
	}//main
}//class
