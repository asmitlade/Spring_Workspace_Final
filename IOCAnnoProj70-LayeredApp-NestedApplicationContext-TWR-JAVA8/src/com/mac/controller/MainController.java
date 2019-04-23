package com.mac.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mac.dto.EmployeeDTO;
import com.mac.service.EmployeeService;

@Component("controller")
@Scope("singleton")
public class MainController {
	@Inject
	private EmployeeService service;

	public MainController(EmployeeService service) {
		this.service = service;
	}
	public List<EmployeeDTO> findEmpByDesg(String desg1, String desg2, String desg3) throws Exception{
		List<EmployeeDTO> listDTO = null;
		//use service class
		listDTO = service.getEmpDetailsByDesg(desg1, desg2, desg3);
		return listDTO;
	}
}
