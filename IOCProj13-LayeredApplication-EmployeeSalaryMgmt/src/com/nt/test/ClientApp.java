package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;

public class ClientApp {
	public static void main(String[] args) {
		String name=null, job=null, bsal=null;
		MainController controller = null;
		try(Scanner sc = new Scanner(System.in)){
			//read inputs
			System.out.println("Enter Employee Name ::");
			name = sc.next();
			System.out.println("Enter Job ::");
			job = sc.next();
			System.out.println("Enter Basic Salary ::");
			bsal = sc.next();
			try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml")) {
				// get bean
				controller = context.getBean("mController", MainController.class);
				System.out.println(controller.process(name, job, bsal));
			}//try
		}//try
	}//main
}//class