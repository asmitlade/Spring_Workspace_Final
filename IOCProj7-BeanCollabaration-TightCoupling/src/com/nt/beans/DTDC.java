package com.nt.beans;

public class DTDC {
	public DTDC() {
		System.out.println("DTDC: 0=param constructor");
	}
	public String deliver(int orderNo) {
		return orderNo + " orderno items delivered by DTDC";
	}
}
