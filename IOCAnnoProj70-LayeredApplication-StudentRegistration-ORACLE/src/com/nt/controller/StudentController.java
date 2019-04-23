package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

@Component("controller")
@Scope("singleton")
public class StudentController {
	
	@Autowired
	private StudentService service;

	public StudentController(StudentService service) {
		System.out.println("StudentController : 0-param constructor");
		this.service = service;
	}
	public String process(String sname,String saddrs,String m1,String m2,String m3) {
		System.out.println("StudentController.process()");
		// prepare StudentVO object
		StudentVO vo = null;
		StudentDTO dto = null;
		String result = null;
		vo = new StudentVO();
		vo.setSname(sname);
		vo.setSaddrs(saddrs);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
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