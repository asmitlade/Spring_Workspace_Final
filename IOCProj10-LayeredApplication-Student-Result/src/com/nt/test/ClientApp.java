package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.StudentController;

public class ClientApp {
	public static void main(String[] args) {
		StudentController controller = null;
		String no=null,name=null,addrs=null,m1=null,m2=null,m3=null;
		//read inputs
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Student No ::");
			no = sc.next();
			System.out.println("Enter Student Name ::");
			name = sc.next();
			System.out.println("Enter Address ::");
			addrs = sc.next();
			System.out.println("Enter Mark1 ::");
			m1 = sc.next();
			System.out.println("Enter Mark2 ::");
			m2 = sc.next();
			System.out.println("Enter Mark3 ::");
			m3 = sc.next();
			try(ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
				//get Bean
				controller = context.getBean("stController", StudentController.class);
				// call method
				System.out.println(controller.process(no, name, addrs, m1, m2, m3));
			}//try
		}//try
	}//main
}//class