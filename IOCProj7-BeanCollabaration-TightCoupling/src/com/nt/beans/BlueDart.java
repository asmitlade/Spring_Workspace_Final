package com.nt.beans;

public class BlueDart {
	public BlueDart() {
		System.out.println("BlueDart: 0=param constructor");
	}
	public String deliver(int orderNo) {
		return orderNo + " orderno items delivered by BlueDart";
	}
}
