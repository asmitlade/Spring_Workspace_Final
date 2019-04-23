package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.TravelAgent;

public class AutowireCandidateTest {
	public static void main(String[] args) {
		TravelAgent agent = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			agent = context.getBean("tagent", TravelAgent.class);
			agent.executePlan();
		}//try
	}//main
}//class
