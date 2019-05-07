package com.mac.service;

import java.util.List;
import java.util.Map;

import com.mac.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	public int fetchEmpCount() {
		int count = 0;
		//get dao
		count = dao.getEmpCount();
		return count;
	}
	
	public String fetchEmpNameById(int empNo) {
		String name = null;
		//get dao
		name = dao.getEmpNameById(empNo);
		return name;
	}

	public Map<String, Object> fetchEmpById(int empNo) {
		Map<String, Object> map=null;
		//get dao
		map = dao.getEmpById(empNo);
		return map;
	}

	public List<Map<String, Object>> fetchEmpByDesg(String desg) {
		List<Map<String, Object>> list = null;
		//get dao
		list = dao.getEmpByDesg(desg);
		return list;
	}

	public String registerEmployee(String name, String desg, int salary) {
		int count = 0;
		// use DAO
		count = dao.insert(name, desg, salary);
		if (count == 0)
			return "registration failed";
		else
			return "registration succeded";
	}

	public String updateEmployee(String desg, int empNo) {
		int count = 0;
		//use dao
		count = dao.update(desg, empNo);
		if(count == 0)
			return "Updatation Successded";
		else
			return "Updatation Successded";
	}

	public String deleteEmployee(int empNo) {
		int count = 0;
		//use dao
		count = dao.delete(empNo);
		if(count == 0)
			return "Record Not Found and Deleted";
		else
			return "Record Found and Deleted";
	}

}
