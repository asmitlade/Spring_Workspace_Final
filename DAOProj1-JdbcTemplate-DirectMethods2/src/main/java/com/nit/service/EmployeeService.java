package com.nit.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.EmployeeDAOImpl;

@Service("service")
public class EmployeeService {

	@Autowired
	private EmployeeDAOImpl dao;


	/*
	 * public EmployeeService(EmployeeDAOImpl dao) { this.dao = dao; }
	 */

public List<Map<String, Object>> showSalary(int no) {
	List<Map<String, Object>> salary=dao.getSalary(no);
	return salary;
}
public List<Map<String, Object>> EmpDetails(int eno) throws Exception{
	List<Map<String, Object>> Details=dao.getEmpDetailsByEmpno(eno);
	if(Details!=null) 
		return Details;
	
	else 
		throw new Exception(eno+" emp no not found");
}

}
