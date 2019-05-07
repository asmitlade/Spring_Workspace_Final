package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;

import com.mac.config.AppConfig;
import com.mac.service.EmployeeService;

public class JdbcTemplateDirectMethodsTest {
    public static void main( String[] args ) {
    	ApplicationContext ctx = null;
    	EmployeeService service = null;
    	//create ctx object 
    	ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	//get bean
    	service = ctx.getBean("empService",EmployeeService.class);
    	try {
	    	//call method
	    	System.out.println("Total Number of Employee is :::"+service.fetchEmpCount());
	    	System.out.println("Employee Name is ::"+service.fetchEmpNameById(7902));
	    	System.out.println("Employee Details By Id ::"+service.fetchEmpById(7902));
	    	System.out.println("Employee Details By Desg ::"+service.fetchEmpByDesg("CLERK"));
	    	//System.out.println(service.registerEmployee("Asmit Lade", "Developer",9000));
	    	//System.out.println(service.updateEmployee("designer", 1000));
	    	System.out.println(service.deleteEmployee(1000));
    	}
    	catch(DataAccessException dae) {
    		dae.printStackTrace();
    	}	
	    //close ctx
    	((AbstractApplicationContext) ctx).close();
    }//main
}//class
