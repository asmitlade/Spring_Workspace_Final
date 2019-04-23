package com.mac.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.controller.MainController;
import com.mac.dto.EmployeeDTO;

public class NestedApplicationContextTest {
	public static void main(String[] args) {
		MainController controller = null;
		List<EmployeeDTO> listDTO = null;
		//create parent bean container 
		try (ClassPathXmlApplicationContext pCtx = new ClassPathXmlApplicationContext("com/mac/cfgs/bussiness-beans.xml")){
			//create child bean container
			try(ClassPathXmlApplicationContext cCtx = new ClassPathXmlApplicationContext(new String[] {"com/mac/cfgs/presentation-beans.xml"},pCtx) ){
				//set parent bean container to child container
				cCtx.setParent(pCtx);
				// refresh the child container
				cCtx.refresh();
				// get bean
				controller = cCtx.getBean("controller", MainController.class);
				//invoke method
				listDTO = controller.findEmpByDesg("MANAGER", "CLERK", "ANALYST");
				//display details
				for(EmployeeDTO dto : listDTO) {
					System.out.println(dto.getEmpno()+" "+dto.getEname()+" "+dto.getDesg()+" "+dto.getSalary());
				}
			}//child try
		}//parent try
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
