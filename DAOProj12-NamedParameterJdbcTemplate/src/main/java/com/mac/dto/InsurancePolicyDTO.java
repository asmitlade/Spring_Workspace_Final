package com.mac.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class InsurancePolicyDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int policyId;
	private String policyName;
	private int tenure;
	private String company;
	private float initialAmt;
}
