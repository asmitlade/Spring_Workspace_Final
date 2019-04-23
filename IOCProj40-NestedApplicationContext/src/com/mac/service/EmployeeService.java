package com.mac.service;

import java.util.List;

import com.mac.dto.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> getEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception;
}
