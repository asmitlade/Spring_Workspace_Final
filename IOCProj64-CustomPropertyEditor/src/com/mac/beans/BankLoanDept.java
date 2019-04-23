package com.mac.beans;

public class BankLoanDept {
	private IntLoanAmt loan;

	public BankLoanDept(IntLoanAmt loan) {
		this.loan = loan;
	}
	
	public float calIntAmt() {
		return (loan.getPamt()*loan.getRate()*loan.getTime())/100.0f;
	}
}
