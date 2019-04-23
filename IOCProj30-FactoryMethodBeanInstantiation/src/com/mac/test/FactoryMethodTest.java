package com.mac.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		
		Class c1 = factory.getBean("c1", Class.class);
		System.out.println("C1 data ::"+c1+"  "+"c1 Class name :: "+c1.getClass());
		
		Calendar c2 = factory.getBean("c2", Calendar.class);
		System.out.println("C2 data ::"+c2+"  "+"c2 Class name ::"+c2.getClass());
		
		String s1 = factory.getBean("s1", String.class);
		System.out.println("S1 data ::"+s1+"  "+"S1 class name ::"+s1.getClass());
		
		String s2 = factory.getBean("s2", String.class);
		System.out.println("S2 data ::"+s2+"  "+"S2 class name ::"+s2.getClass());
		
		StringBuffer sb = factory.getBean("sb", StringBuffer.class);
		System.out.println("sb data ::"+sb+" "+"sb class name ::"+sb.getClass());
		
		String s3 = factory.getBean("s3", String.class);
		System.out.println("s3 data ::"+s3+" "+"s3 class name ::"+s3.getClass());
		
		
		
	}//main
}//class
