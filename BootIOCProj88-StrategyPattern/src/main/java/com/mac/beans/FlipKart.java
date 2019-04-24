package com.mac.beans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class FlipKart {
	@Autowired
	private Courier courier;
	
	public String shopping(String[] items) {
		int oid = 0;
		String status = null;
		float billAmt = 0.0f;
		//generate bill amount
		billAmt = (items.length)*1000;
		//generate order id randomly
		oid = new Random().nextInt(1000);
		status = courier.deliver(oid);
		return "You Parchased Items bill amount is ::"+billAmt+" and "+status;
	}
}
