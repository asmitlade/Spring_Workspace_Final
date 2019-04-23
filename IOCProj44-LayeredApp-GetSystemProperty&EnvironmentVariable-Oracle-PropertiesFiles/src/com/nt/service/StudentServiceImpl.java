package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	private StudentDAO dao;
	private String osname;
	private String java_home;
	
	public StudentServiceImpl(StudentDAO dao) {
		System.out.println("StudentServiceImpl : 0-param constructor");
		this.dao = dao;
	}
	
	public String getOsname() {
		return osname;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	public String getJava_home() {
		return java_home;
	}

	public void setJava_home(String java_home) {
		this.java_home = java_home;
	}
	@Override
	public String generateResult(StudentDTO dto) {
		System.out.println(osname+"    "+java_home);
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