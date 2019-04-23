package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.Employee;
import com.mac.beans.Student;

public class NullInjectionTest {
	public static void main(String[] args) {
		Student s1 = null;
		Employee e1 = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			s1 = context.getBean("std", Student.class);
			System.out.println(s1);
			e1 = context.getBean("emp", Employee.class);
			System.out.println(e1);
 		}//try
	}//main
}//class
