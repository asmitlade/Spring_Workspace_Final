package com.mac.dao;

import java.util.List;

import com.mac.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> findEmpDetailsByDesg(String desg1, String desg2, String desg3)throws Exception;
}
