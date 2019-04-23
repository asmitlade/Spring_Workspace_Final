package com.mac.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ProffessionalCricketer {
	private String beanId;

	public ProffessionalCricketer(String beanId) {
		this.beanId = beanId;
	}
	public void bowling() {
		System.out.println("ProffessionalCricketer:bowling()");
	}
	public void fielding() {
		System.out.println("ProffessionalCricketer:fielding()");
	}
	public void batting() {
		CricketBat bat = null;
		int score = 0;
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
		reader.loadBeanDefinitions("com/mac/cfgs/applicationContext.xml");
		
		bat = context.getBean(beanId, CricketBat.class);
		score = (int) bat.run();
		System.out.println("Run"+score);
	}//method
}//class
