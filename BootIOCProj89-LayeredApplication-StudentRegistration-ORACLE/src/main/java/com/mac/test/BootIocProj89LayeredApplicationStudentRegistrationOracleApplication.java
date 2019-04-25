package com.mac.test;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.mac.config.AppConfig;
import com.mac.controller.StudentController;
import com.mac.vo.StudentVO;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootIocProj89LayeredApplicationStudentRegistrationOracleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Scanner sc = null;
		StudentVO vo = null;
		String sname = null;
		String saddrs = null;
		String m1 = null;
		String m2 = null;
		String m3 = null;
		String result = null;
		StudentController controller = null;
		sc = new Scanner(System.in);
		System.out.println("Enter Student Name :::");
		sname = sc.next();
		System.out.println("Enter Student Address :::");
		saddrs = sc.next();
		System.out.println("Enter Student Mark1 :::");
		m1 = sc.next();
		System.out.println("Enter Student Mark2 :::");
		m2 = sc.next();
		System.out.println("Enter Student Mark3 :::");
		m3 = sc.next();
		//create StudentVO class object
		vo = new StudentVO();
		//set input values to StudentVO object
		vo.setSname(sname);
		vo.setSaddrs(saddrs);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);

		ctx = SpringApplication.run(BootIocProj89LayeredApplicationStudentRegistrationOracleApplication.class, args);
		//get bean
		controller = ctx.getBean("controller", StudentController.class);
		try {
			//invoke controller method
			result = controller.process(vo);
			if(result!=null)
				System.out.println("The Result is :::"+result);
			else
				System.out.println("Internal Problem");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem Occured...");
		}
		sc.close();
		((ConfigurableApplicationContext) ctx).close();
	}//main
}//class
