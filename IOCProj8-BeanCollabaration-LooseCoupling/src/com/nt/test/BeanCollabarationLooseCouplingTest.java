package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.bean.Amazon;

public class BeanCollabarationLooseCouplingTest {

	public static void main(String[] args) {
		Amazon amzon = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
			amzon = (Amazon) context.getBean("amz");
			System.out.println(amzon.shopping(new String[] {"Bag","Laptop","wallet","watch"}, new float[] {1000,50000,900,1500}));
		}//try
	}//main
}//class