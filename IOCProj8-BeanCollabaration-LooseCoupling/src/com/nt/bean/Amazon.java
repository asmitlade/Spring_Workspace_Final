package com.nt.bean;

import java.util.Arrays;
import java.util.Random;

public class Amazon {
	private Courier courier;
	public Amazon(Courier courier) {
		System.out.println("1-param constructor::Amazon");
		this.courier = courier;
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
		// use Courier object for delivering the products
		deliverStatus = courier.deliver(orderNo);
		return Arrays.toString (items)+" are ordered with prices "+ Arrays.toString(prices)+"having Bill Amount::"+billAmt+" and delivery status="+deliverStatus;
	}
}