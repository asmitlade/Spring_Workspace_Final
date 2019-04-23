package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeService service;
	
	public MainController(EmployeeService service) {
		super();
		this.service = service;
	}
	
	public String process(String name, String job, String bsal) {
		// prepare VO object
		EmployeeVO vo = null;
		EmployeeDTO dto = null;
		String result = null;
		vo = new EmployeeVO();
		vo.setEname(name);
		vo.setJob(job);
		vo.setBsal(bsal);
		// convert vo object to dto object
		dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setJob(dto.getJob());
		dto.setBsal(Integer.parseInt(vo.getBsal()));
		result = service.salaryCal(dto);
		return result;
	}//method
}//class
