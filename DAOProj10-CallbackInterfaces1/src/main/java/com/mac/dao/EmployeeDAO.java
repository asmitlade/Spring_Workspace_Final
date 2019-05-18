package com.mac.dao;

import java.util.List;

import com.mac.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> getEmpDetailsByDesg(String job);
}
