package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC {
	public DTDC() {
		System.out.println("DTDC: 0=param constructor");
	}
	public String deliver(int orderNo) {
		return orderNo + " orderno items delivered by DTDC";
	}
}
