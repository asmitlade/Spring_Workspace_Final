package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Veichle;

public class StrategyDP_BPPTest {

	public static void main(String[] args) {
		Veichle veichle = null;
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			veichle = ctx.getBean("veichle", Veichle.class);
			veichle.journey("Ghanod", "Hyderabad");
			System.out.println("-------------------------");
			veichle.journey("Sakoli", "Nagpur");
		}//try
	}//main
}//class
