package com.mac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mac.dto.StudentDTO;
import com.mac.service.StudentService;
import com.mac.vo.StudentVO;

@Component("controller")
public class StudentController {
	
	@Autowired
	private StudentService service;

	/*
	public StudentController(StudentService service) {
		System.out.println("StudentController : 0-param constructor");
		this.service = service;
	}
	*/
	public String process(StudentVO vo) {
		StudentDTO dto = null;
		String result = null;
		// convert vo object to dto object
		dto = new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSaddrs(vo.getSaddrs());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		// use service class
		result = service.generateResult(dto);
		return result;
	}//method
}//class