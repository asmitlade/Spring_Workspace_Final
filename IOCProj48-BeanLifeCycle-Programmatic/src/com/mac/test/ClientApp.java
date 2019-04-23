package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.CheckVoting;

public class ClientApp {

	public static void main(String[] args) {
		CheckVoting cv = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			cv = ctx.getBean("vote", CheckVoting.class);
			System.out.println(cv.checkVoting());
		}///try
	}//main
}//class
