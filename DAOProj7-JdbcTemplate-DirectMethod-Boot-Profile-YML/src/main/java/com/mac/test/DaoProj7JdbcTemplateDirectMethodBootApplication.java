package com.mac.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DataAccessException;

import com.mac.config.AppConfig;
import com.mac.service.EmployeeService;

@SpringBootApplication
@Import(AppConfig.class)

public class DaoProj7JdbcTemplateDirectMethodBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = null;
		EmployeeService service = null;
		//Environment env = null;
		ctx = SpringApplication.run(DaoProj7JdbcTemplateDirectMethodBootApplication.class, args);
		ctx.getEnvironment().getActiveProfiles();
		//ctx.refresh();
		service = ctx.getBean("empService", EmployeeService.class);
		
		try {
	    	//call method
	    	System.out.println("Total Number of Employee is :::"+service.fetchEmpCount());
	    	System.out.println("Employee Name is ::"+service.fetchEmpNameById(7902));
	    	System.out.println("Employee Details By Id ::"+service.fetchEmpById(7902));
	    	System.out.println("Employee Details By Desg ::"+service.fetchEmpByDesg("CLERK"));
	    	//System.out.println(service.registerEmployee("Asmit Lade", "Developer",9000));
	    	//System.out.println(service.updateEmployee("designer", 1000));
	    	//System.out.println(service.deleteEmployee(1000));
	    	
	    	//System.out.println(env.getActiveProfiles());
    	}//try
    	catch(DataAccessException dae) {
    		dae.printStackTrace();
    	}	
		//close ctx
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
