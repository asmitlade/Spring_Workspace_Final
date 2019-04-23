package com.mac.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("loanDept")
public class BankLoanDept {
	@Autowired
	private IntLoanAmt loan;

	/*public BankLoanDept(IntLoanAmt loan) {
		this.loan = loan;
	}*/
	
	public float calIntAmt() {
		return (loan.getPamt()*loan.getRate()*loan.getTime())/100.0f;
	}
}
