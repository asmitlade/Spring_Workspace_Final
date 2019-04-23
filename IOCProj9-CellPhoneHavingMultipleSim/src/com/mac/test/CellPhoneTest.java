package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.CellPhoneOperation;

public class CellPhoneTest {

	public static void main(String[] args) {
		CellPhoneOperation cell = null;
		try(ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");){
			cell = context.getBean("cpo", CellPhoneOperation.class);
			cell.cellOp();
		}
	}

}
