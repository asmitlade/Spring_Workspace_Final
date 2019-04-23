package com.mac.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mac.beans.BankLoanDept;

public class CustomPropertyEditorTest_BF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		BankLoanDept loanDept = null;
		//create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		loanDept = factory.getBean("loanDept", BankLoanDept.class);
		System.out.println("Simple Loan Interest Amount ::"+loanDept.calIntAmt());
	}
}
