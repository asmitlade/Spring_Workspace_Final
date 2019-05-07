package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.config.AppConfig;
import com.nit.service.EmployeeService;

public class DirectTest {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx=null;
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService service=ctx.getBean("service", EmployeeService.class);
		System.out.println(service.showSalary(7499));
		System.out.println(service.EmpDetails(7902));
		((AbstractApplicationContext) ctx).close();
	}
}
