package com.mac.service;

import org.springframework.beans.BeanUtils;

import com.mac.bo.EmployeeBO;
import com.mac.dao.EmployeeDAO;
import com.mac.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	
	private EmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	public EmployeeDTO searchEmpByEmpNo(int empNo) {
		EmployeeBO bo = null;
		EmployeeDTO dto = null;
		//use dao
		bo = dao.getEmpDetailsById(empNo);
		//create dto class object and transfer bo to dto
		dto = new  EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

}
