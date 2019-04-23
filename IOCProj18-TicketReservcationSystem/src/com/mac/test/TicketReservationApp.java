package com.mac.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.controller.MainController;

public class TicketReservationApp {

	public static void main(String[] args) {
		MainController mc = null;
		String source = null, dest = null;
		
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			try(Scanner sc =new Scanner(System.in)){
				System.out.println("Enter Source name ::");
				source = sc.next();
				System.out.println("Enter Destination name ::");
				dest = sc.next();
				mc = context.getBean("pController", MainController.class);
				System.out.println(mc.process(source, dest));
			}//try
		}//try
	}//main
}//class
