package com.mac.service;

import java.util.List;

import com.mac.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	public List<EmployeeDTO> searchEmpbyDesg(String job);
}
