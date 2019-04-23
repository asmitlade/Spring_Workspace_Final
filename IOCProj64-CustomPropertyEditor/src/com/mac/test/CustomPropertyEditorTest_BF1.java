package com.mac.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mac.beans.BankLoanDept;
import com.mac.beans.IntLoanAmt;
import com.mac.editor.IntLoanAmtEditor;

public class CustomPropertyEditorTest_BF1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BankLoanDept loanDept=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		//add PropertyEditorRegistar to IOC Container
		factory.addPropertyEditorRegistrar(new MyPERegistar());
		//get bean
		loanDept=factory.getBean("loanDept",BankLoanDept.class);
		//invoke  method
		System.out.println("intr Amount::"+loanDept.calIntAmt());
	}
	
	//Custom PropertyEditorRegistar that gives access PropertyEditorRegistry
	private static class MyPERegistar implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
		  registry.registerCustomEditor(IntLoanAmt.class, new IntLoanAmtEditor());
		}//method
		
	}//class
}//class
