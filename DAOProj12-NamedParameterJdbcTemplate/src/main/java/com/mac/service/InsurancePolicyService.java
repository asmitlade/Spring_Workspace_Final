package com.mac.service;

import java.util.List;

import com.mac.dto.InsurancePolicyDTO;

public interface InsurancePolicyService {
	public InsurancePolicyDTO getPolicyDetailsById(int policId);
	public List<InsurancePolicyDTO> getPolicyDetailsByName(String name1, String name2, String name3);
	public String register(InsurancePolicyDTO dto);
}
