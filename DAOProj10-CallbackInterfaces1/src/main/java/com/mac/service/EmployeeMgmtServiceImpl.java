package com.mac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.bo.EmployeeBO;
import com.mac.dao.EmployeeDAO;
import com.mac.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	@Autowired
	private EmployeeDAO dao;
	
	/*
	 * public EmployeeMgmtServiceImpl(EmployeeDAO dao) { this.dao = dao; }
	 */

	@Override
	public List<EmployeeDTO> searchEmpbyDesg(String job) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO = new ArrayList<EmployeeDTO>();
		
	    //use DAO
		listBO=dao.getEmpDetailsByDesg(job);
		//convert ListBO to ListDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		return listDTO;
	}
}
