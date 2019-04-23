package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.AadharDetails;

public class BuiltInPropertyEditorTest {

	public static void main(String[] args) {
		AadharDetails aadhar = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			aadhar = ctx.getBean("aadhar", AadharDetails.class);
			System.out.println(aadhar.toString());
		}//try
	}//main
}//class
