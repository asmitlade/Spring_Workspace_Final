package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Bike;

public class BeanInheritanceTest {
	public static void main(String[] args) {
		Bike bike = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
								("com/mac/cfgs/applicationContext.xml")){
			bike = context.getBean("bajajBike1", Bike.class);
			System.out.println(bike);
			System.out.println("----------------------------------------");
			bike = context.getBean("bajajBike2", Bike.class);
			System.out.println(bike);
		}//try
	}//main
}//class
