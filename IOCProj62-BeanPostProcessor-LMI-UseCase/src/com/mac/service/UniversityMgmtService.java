package com.mac.service;

import org.springframework.beans.BeanUtils;

import com.mac.bo.EmployeeBO;
import com.mac.bo.StudentBO;
import com.mac.dao.UniversityDAO;
import com.mac.dto.EmployeeDTO;
import com.mac.dto.StudentDTO;

public abstract class UniversityMgmtService {
	private UniversityDAO dao;

	public UniversityMgmtService(UniversityDAO dao) {
		System.out.println("UniversityMgmtService : 1-param constructor");
		this.dao = dao;
	}

	public abstract StudentBO createStudentBO();
	public abstract EmployeeBO createEmployeeBO();
	
	public String registerStudent(StudentDTO dto) {
		StudentBO bo = null;
		int count = 0;
		//get StudentBO obj
		bo = createStudentBO();
		//copy all value to bo
		BeanUtils.copyProperties(dto, bo);
		count = dao.insertStudentData(bo);
		if(count == 0) {
			return "Student Data not Inserted";
		}
		else {
			return "Student Data Inserted";
		}
	}
	
	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo  = null;
		int count = 0;
		//get EmployeeBO obj
		bo = createEmployeeBO();
		//copy all value to bo
		BeanUtils.copyProperties(dto, bo);
		count = dao.insertEmployeeData(bo);
		if(count == 0)
			return "Employee Data not Inserted";
		else
			return "Employee Data Inserted";
	}
}
