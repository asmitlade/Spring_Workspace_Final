package com.mac.beans;

public class IntLoanAmt {
	private float pamt;
	private float rate;
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
