package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mac.cfgs.AppConfig;
import com.mac.service.EmployeeMgmtService;

public class CallBackInterfacesTest {
    public static void main( String[] args ) {
    	ApplicationContext ctx = null;
    	EmployeeMgmtService service = null;
    	ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	service = ctx.getBean("empService", EmployeeMgmtService.class);
    	System.out.println("Employee Details by Desg :::"+service.searchEmpbyDesg("CLERK"));
    	((AbstractApplicationContext) ctx).close();
    }
}
