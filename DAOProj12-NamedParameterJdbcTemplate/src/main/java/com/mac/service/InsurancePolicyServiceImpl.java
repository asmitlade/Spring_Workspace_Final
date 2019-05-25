package com.mac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.bo.InsurancePolicyBO;
import com.mac.dao.InsurancePolicyDAO;
import com.mac.dto.InsurancePolicyDTO;

@Service("pService")
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

	@Autowired
	private InsurancePolicyDAO dao;
	
	public InsurancePolicyDTO getPolicyDetailsById(int policyId) {
		InsurancePolicyDTO dto = new InsurancePolicyDTO();
		InsurancePolicyBO bo = new InsurancePolicyBO();
		//use dao
		bo = dao.getPolicyById(policyId);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public List<InsurancePolicyDTO> getPolicyDetailsByName(String name1, String name2, String name3) {
		List<InsurancePolicyDTO> listDTO = new ArrayList();
		List<InsurancePolicyBO> listBO = null;
		//use dao
		listBO = dao.getDetailsByName(name1, name2, name3);
		listBO.forEach(bo->{
			InsurancePolicyDTO dto = null;
			dto = new InsurancePolicyDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

	@Override
	public String register(InsurancePolicyDTO dto) {
		InsurancePolicyBO bo = null;
		int result = 0;
		bo = new InsurancePolicyBO();
		BeanUtils.copyProperties(dto, bo);
		result = dao.insert(bo);
		if(result==0)
			return "Registration Failed";
		else	
			return "Registration Sucsseded";
	}
}
