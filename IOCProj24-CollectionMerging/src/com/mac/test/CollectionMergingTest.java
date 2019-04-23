package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.EngineeringCourse;
import com.mac.beans.Food;

public class CollectionMergingTest {

	public static void main(String[] args) {
		EngineeringCourse ec = null;
		Food food = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
													"com/mac/cfgs/applicationContext.xml")){
			ec = context.getBean("base1styear", EngineeringCourse.class);
			System.out.println(ec);
			food = context.getBean("food", Food.class);
			System.out.println(food);
		}//try
	}//main
}//class
