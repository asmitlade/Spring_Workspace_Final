package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.service.EmployeeService;

public class JdbcTemplateDirectMethodsTest {
    public static void main( String[] args ) {
    	ApplicationContext ctx = null;
    	EmployeeService service = null;
    	//create ctx object 
    	ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
    	//get bean
    	service = ctx.getBean("service",EmployeeService.class);
    	//call method
    	System.out.println("Total Number of Employee is :::"+service.fetchEmpCount());
    	System.out.println("Employee Name is ::"+service.fetchEmpNameById(7902));
    	System.out.println("Employee Details By Id ::"+service.fetchEmpById(7902));
    	System.out.println("Employee Details By Desg ::"+service.fetchEmpByDesg("CLERK"));
    	//System.out.println(service.registerEmployee("Asmit Lade", "Developer",9000));
    	//System.out.println(service.updateEmployee("designer", 1000));
    	System.out.println(service.deleteEmployee(1000));
    	//close ctx
    	((AbstractApplicationContext) ctx).close();
    }//main
}//class
