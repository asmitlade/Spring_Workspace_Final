package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;
	
	public StudentServiceImpl(StudentDAO dao) {
		System.out.println("StudentServiceImpl : 0-param constructor");
		this.dao = dao;
	}
	
	@Override
	public String generateResult(StudentDTO dto) {
		System.out.println("StudentServiceImpl.generateResult()");
		// write B.logic
		int total = 0;
		float avg = 0.0f;
		String result = null;
		int cnt = 0;
		total = dto.getM1()+dto.getM2()+dto.getM3();
		avg = total/3.0f;
		if(avg<35)
			result = "Fail";
		else
			result = "Pass";
		// create BO class object
		StudentBO bo = new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSaddrs(dto.getSaddrs());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		// use DAO
		cnt = dao.insert(bo);
		if(cnt == 0)
			return "Result ::"+bo.getResult()+"  "+"Registration Failed";
		else
			return "Result ::"+bo.getResult()+"  "+"Registration Succeded";
	}//method
}//class