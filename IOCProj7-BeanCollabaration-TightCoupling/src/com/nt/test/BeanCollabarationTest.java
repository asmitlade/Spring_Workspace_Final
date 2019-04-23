package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Amazon;

public class BeanCollabarationTest {

	public static void main(String[] args) {
		//BeanFactory factory = null;
		Amazon amz = null;
		//factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		amz = (Amazon) context.getBean("amzon");
		System.out.println(amz.shopping(new String[] {"Mi4","Asus K53U","Jeans"}, new float[] {19992,283233,2122}));
		
	}// main
}//class