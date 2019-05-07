package com.mac.service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

	public int fetchEmpCount();
	public String fetchEmpNameById(int empNo);
	public Map<String, Object> fetchEmpById(int empNo);
	public List<Map<String, Object>> fetchEmpByDesg(String desg);
	public String registerEmployee(String name,String desg,int salary);
	public String updateEmployee(String desg, int empNo);
	public String deleteEmployee(int empNo); 
}
