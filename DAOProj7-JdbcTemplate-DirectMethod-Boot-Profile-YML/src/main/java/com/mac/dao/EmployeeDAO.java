package com.mac.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {
	public int getEmpCount();
	public String getEmpNameById(int empNo);
	public Map<String, Object> getEmpById(int empNo);
	public List<Map<String, Object>> getEmpByDesg(String desg);
	public int insert(String ename,String desg,int salary);
	public int update(String desg, int empNo);
	public int delete(int empNo);
}
