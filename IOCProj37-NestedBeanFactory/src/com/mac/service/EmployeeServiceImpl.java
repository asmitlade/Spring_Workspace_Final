package com.mac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.mac.bo.EmployeeBO;
import com.mac.dao.EmployeeDAO;
import com.mac.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<EmployeeDTO> getEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeDTO> listDTO = null;
		List<EmployeeBO> listBO = null;
		//use DAO 
		listBO = dao.findEmpDetailsByDesg(desg1, desg2, desg3);
		//convert listBO to listDTO
		listDTO = new ArrayList();
		for(EmployeeBO bo : listBO) {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}//for
		return listDTO;
	}
}