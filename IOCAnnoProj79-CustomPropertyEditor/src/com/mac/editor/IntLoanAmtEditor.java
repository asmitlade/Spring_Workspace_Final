package com.mac.editor;

import java.beans.PropertyEditorSupport;

import com.mac.beans.IntLoanAmt;

public class IntLoanAmtEditor extends PropertyEditorSupport {
	
	public IntLoanAmtEditor() {
		System.out.println("IntLoanAmtEditor : 0-param constructor");
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		int pamt=0,rate=0,time=0;
		IntLoanAmt loan = null;
		pamt = Integer.parseInt(text.substring(0,text.indexOf(",")));
		rate = Integer.parseInt(text.substring(text.indexOf(",")+1, text.lastIndexOf(",")));
		time = Integer.parseInt(text.substring(text.lastIndexOf(",")+1, text.length()));
		//set value to loan obj
		loan = new IntLoanAmt();
		loan.setPamt(pamt);
		loan.setRate(rate);
		loan.setTime(time);
		
		setValue(loan);		
	}//method
}//class
