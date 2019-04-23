package com.mac.beans;

import java.util.Scanner;

public class ProffessionalCricketer {
	private CricketBat beanId;
	private String name;
	public ProffessionalCricketer(CricketBat beanId) {
		this.beanId = beanId;
	}

	public  void bowling(){
		System.out.println(this.name+" : doing bowling");
	}
	
	public  void fielding(){
		System.out.println(this.name+" : doing fielding");
	}
	
	public void batting(){
		int runs=0;
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter Cricketer Name ::");
			name =sc.next();
			runs=(int) beanId.run();
			System.out.println(name+" do batting and scored "+runs +" runs");
		}//try
	}//method
}//class