package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bean.Student;

public class StudentCourseMaterialProvider {

	public static void main(String[] args) {
		Student st = null;
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		st = ctx.getBean("student", Student.class);
		System.out.println(st);
		((AbstractApplicationContext) ctx).close();
	}//main
}//class