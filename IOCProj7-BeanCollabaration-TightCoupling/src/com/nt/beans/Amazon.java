package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Amazon {
	private BlueDart dart;
//	private DTDC dtdc;
	public Amazon(BlueDart dart) {
		System.out.println("1-param constructor::Amazon");
		this.dart = dart;
	}
	public String shopping(String items[], float prices[]) {
		float billAmt = 0.0f;
		Random rad = null;
		int orderNo = 0;
		String deliverStatus = null;
		// calculate bill amount
		for(int i=0; i<prices.length;++i) {
			billAmt = billAmt+prices[i];
		}
		// generate order number
		rad = new Random();
		orderNo = rad.nextInt(100000);
		// use BlueDart on=bject for delivering the products
		deliverStatus = dart.deliver(orderNo);
		return Arrays.toString (items)+" are ordered with prices "+ Arrays.toString(prices)+"having Bill Amount::"+billAmt+" and delivery status="+deliverStatus;
	}
}