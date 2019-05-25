package com.mac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mac.dto.InsurancePolicyDTO;
import com.mac.service.InsurancePolicyService;
import com.mac.service.InsurancePolicyServiceImpl;

public class NamedParameterJdbcTemplateTest {
	public static void main(String[] args) {

		ApplicationContext ctx = null;
		InsurancePolicyService policy = null;
		InsurancePolicyDTO dto = null;
		//create IOC container
		ctx = new ClassPathXmlApplicationContext("com/mac/cfgs/applicationContext.xml");
		//get bean
		policy = ctx.getBean("pService", InsurancePolicyServiceImpl.class);
		//invoke method
		System.out.println("GET POLICY DETAILS BY ID :::"+policy.getPolicyDetailsById(1001));
		System.out.println("GET POLICY DETAILS BY Name :::"+policy.getPolicyDetailsByName("jws","ja","js"));
		dto = new InsurancePolicyDTO();
		dto.setPolicyId(9090);
		dto.setPolicyName("jaa");
		dto.setTenure(22);
		dto.setCompany("LIC");
		dto.setInitialAmt(82773);
		System.out.println(policy.register(dto));
		//close ctx
		((AbstractApplicationContext) ctx).close();
	}
}
