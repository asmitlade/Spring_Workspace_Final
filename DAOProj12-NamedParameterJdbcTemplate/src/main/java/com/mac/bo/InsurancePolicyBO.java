package com.mac.bo;

import lombok.Data;

@Data
public class InsurancePolicyBO {
	private int policyId;
	private String policyName;
	private int tenure;
	private String company;
	private float initialAmt;
}
