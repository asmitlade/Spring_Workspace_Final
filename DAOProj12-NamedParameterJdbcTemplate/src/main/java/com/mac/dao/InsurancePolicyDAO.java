package com.mac.dao;

import java.util.List;

import com.mac.bo.InsurancePolicyBO;

public interface InsurancePolicyDAO {
	public InsurancePolicyBO getPolicyById(int policyId);
	public List<InsurancePolicyBO> getDetailsByName(String name1, String name2, String name3);
	public int insert(InsurancePolicyBO bo);
}
