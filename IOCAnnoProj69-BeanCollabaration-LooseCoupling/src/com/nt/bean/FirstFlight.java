package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("fFlight")
public class FirstFlight implements Courier {

	public FirstFlight() {
		System.out.println("FirstFlight: 0=param constructor");
	}
	@Override
	public String deliver(int orderNo) {
		return orderNo+"orderNo items delivered by FirstFlight";
	}
}
