package com.mac.test;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mac.beans.BankLoanDept;

public class CustomPropertyEditorTest_BF2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BankLoanDept loanDept=null;
		CustomEditorConfigurer configure = null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		//get access to CustomEditorConfigurer
		configure = factory.getBean("cec", CustomEditorConfigurer.class);
		configure.postProcessBeanFactory(factory);
		//get bean
		loanDept=factory.getBean("loanDept",BankLoanDept.class);
		//invoke  method
		System.out.println("intr Amount::"+loanDept.calIntAmt());
	}
}//class
