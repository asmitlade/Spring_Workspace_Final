package com.mac.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("intloan")
public class IntLoanAmt {
	@Value("100000")
	private float pamt;
	@Value("2")
	private float rate;
	@Value("12")
	private float time;

	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "IntLoanAmt [pamt=" + pamt + ", rate=" + rate + ", time=" + time + "]";
	}
	
}
