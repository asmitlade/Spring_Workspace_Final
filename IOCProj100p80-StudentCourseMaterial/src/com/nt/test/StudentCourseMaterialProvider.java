package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.bean.Student;
import com.nt.config.AppConfig;

public class StudentCourseMaterialProvider {

	public static void main(String[] args) {
		Student st = null;
		ApplicationContext ctx = null;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		st = ctx.getBean("stud", Student.class);
		st.display();
		((AbstractApplicationContext) ctx).close();
	}//main
}//class