package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.service.EmployeeMgmtService;

public class CallBackInterfacesTest {
    public static void main( String[] args ) {
    	ApplicationContext ctx = null;
    	EmployeeMgmtService service = null;
    	ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
    	service = ctx.getBean("service", EmployeeMgmtService.class);
    	System.out.println("Employee Details :::"+service.searchEmpByEmpNo(7902));
    	((AbstractApplicationContext) ctx).close();
    }
}
