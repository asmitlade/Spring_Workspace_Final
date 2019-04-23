package com.mac.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.beans.ListCollectionInjection;
import com.mac.beans.MapCollectionInjection;
import com.mac.beans.PropertiesCollectionInjection;
import com.mac.beans.SetCollectionInjection;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		ListCollectionInjection lci = null;
		SetCollectionInjection sci = null;
		MapCollectionInjection mci = null;
		PropertiesCollectionInjection pci = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml")){
			lci = context.getBean("sname", ListCollectionInjection.class);
			System.out.println(lci);
			System.out.println("------------------------------------");
			sci = context.getBean("mobno", SetCollectionInjection.class);
			System.out.println(sci);
			System.out.println("------------------------------------");
			mci = context.getBean("uid", MapCollectionInjection.class);
			System.out.println(mci);
			System.out.println("------------------------------------");
			pci = context.getBean("empDesg", PropertiesCollectionInjection.class);
			System.out.println(pci);
		}//try
	}//main
}//class
