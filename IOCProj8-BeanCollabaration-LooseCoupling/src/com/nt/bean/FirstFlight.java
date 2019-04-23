package com.nt.bean;

public class FirstFlight implements Courier {

	public FirstFlight() {
		System.out.println("FirstFlight: 0=param constructor");
	}
	@Override
	public String deliver(int orderNo) {
		return orderNo+"orderNo items delivered by FirstFlight";
	}
}
