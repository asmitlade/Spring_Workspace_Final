package com.mac.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mac.beans.ProffessionalCricketer;

public class DependencyLookupTest {
	public static void main(String[] args) {
		ProffessionalCricketer pc = null;
		DefaultListableBeanFactory context = null;
		XmlBeanDefinitionReader reader = null;
		context = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(context);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		pc = context.getBean("ckt", ProffessionalCricketer.class);
		System.out.println(pc);
		pc.batting();
		pc.bowling();
		pc.fielding();
	}//main
}//class
