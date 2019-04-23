package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDISolutionUsing1SetterMethodOtherConstructorTest {

	public static void main(String[] args) {
		A a;
		B b;
		try(ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml")){
			a = context.getBean("a1", A.class);
			System.out.println(a);
			System.out.println("--------------------");
			b = context.getBean("b1", B.class);
			System.out.println(b);
		}//try
	}//main
}//class
