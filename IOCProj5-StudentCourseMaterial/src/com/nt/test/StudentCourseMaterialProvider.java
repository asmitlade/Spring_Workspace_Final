package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.bean.Student;

public class StudentCourseMaterialProvider {

	public static void main(String[] args) {
		Student st = null;
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		st = (Student) factory.getBean("std");
		st.display();
	}//main
}//class