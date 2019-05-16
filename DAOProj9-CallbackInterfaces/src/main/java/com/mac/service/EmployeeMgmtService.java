package com.mac.service;

import java.util.List;

import com.mac.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	public EmployeeDTO searchEmpByEmpNo(int empNo);
	public List<EmployeeDTO> searchEmpbyDesg(String job);
}
