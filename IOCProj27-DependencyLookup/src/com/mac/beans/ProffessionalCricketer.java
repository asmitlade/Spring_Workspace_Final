package com.mac.beans;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProffessionalCricketer {
	private String beanId;
	private String name;
	public ProffessionalCricketer(String beanId) {
		this.beanId = beanId;
	}

	public  void bowling(){
		System.out.println(this.name+" : doing bowling");
	}
	
	public  void fielding(){
		System.out.println(this.name+" : doing fielding");
	}
	
	public void batting(){
		/*DefaultListableBeanFactory factory=null;
		CricketBat bat=null;
		int runs=0;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		*/
		
		int runs=0;
		CricketBat bat=null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			try(Scanner sc = new Scanner(System.in)){
				System.out.println("Enter Cricketer Name ::");
				name =sc.next();
				bat=context.getBean(beanId,CricketBat.class);
				runs=(int) bat.run();
				System.out.println(name+" is batting and scored "+runs +" runs");
			}//try
		}//try
			
	}//method
}//class