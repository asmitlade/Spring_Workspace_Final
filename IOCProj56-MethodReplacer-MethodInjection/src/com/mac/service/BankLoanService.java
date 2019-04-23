package com.mac.service;

public class BankLoanService {
	public float calIntrAmount(float pamt, float time) {
		System.out.println("BankLoanService.calIntrAmount(-,-)");
		return (float) (pamt*Math.pow(1+0.2f/100, time)-pamt);
	}
}
