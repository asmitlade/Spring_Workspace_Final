package com.mac.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mac.controller.MainController;
import com.mac.dto.EmployeeDTO;

public class NestedBeanFactoryTest {
	public static void main(String[] args) {
		try {
			DefaultListableBeanFactory pFactory = null, cFactory=null;
			XmlBeanDefinitionReader pReader = null, cReader = null;
			MainController controller = null;
			List<EmployeeDTO> listDTO = null;
			//create Parent IOC container
			pFactory = new DefaultListableBeanFactory();
			pReader = new XmlBeanDefinitionReader(pFactory);
			pReader.loadBeanDefinitions("com/mac/cfgs/bussiness-beans.xml");
			//create Child IOC container
			cFactory = new DefaultListableBeanFactory(pFactory);
			cReader = new XmlBeanDefinitionReader(cFactory);
			cReader.loadBeanDefinitions("com/mac/cfgs/presentation-beans.xml");
			// get bean
			controller = cFactory.getBean("controller", MainController.class);
			//invoke method
			listDTO = controller.findEmpByDesg("MANAGER", "CLERK", "ANALYST");
			//display details
			for(EmployeeDTO dto : listDTO) {
				System.out.println(dto.getEmpno()+" "+dto.getEname()+" "+dto.getDesg()+" "+dto.getSalary());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
