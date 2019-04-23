package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.EmployeeDetails;

public class EmpDetailsDisplay {

	public static void main(String[] args) {
		/*BeanFactory factory = null;
		Resource res = null;
		EmployeeDetails emp = null;
		
		res = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		factory = new XmlBeanFactory(res);
		Object o1 = factory.getBean("emp1");
		emp = (EmployeeDetails)o1;*/
		EmployeeDetails emp = null;
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");){
		Object o1 = context.getBean("emp1");
		emp = (EmployeeDetails)o1;
		System.out.println("Employee Details :::");
		System.out.println("Employee No :::"+emp.getEmpno()+
							"\nEmployee Name ::: "+emp.getEname()+
							"\nEmployee Address ::: "+emp.getAddress()+
							"\nEmployee Designation ::: "+emp.getDesignation()+
							"\nEmployee Salary :::"+emp.getSal());
		System.out.println("=================================");
		Object o2 = context.getBean("emp2");
		emp = (EmployeeDetails)o2;
		System.out.println("Employee No :::"+emp.getEmpno()+
							"\nEmployee Name ::: "+emp.getEname()+
							"\nEmployee Address ::: "+emp.getAddress()+
							"\nEmployee Designation ::: "+emp.getDesignation()+
							"\nEmployee Salary :::"+emp.getSal());
		}//try
	}//main
}//class
