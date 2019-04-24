package com.mac.beans;

import org.springframework.stereotype.Component;

@Component("fFlight")
public class FirstFlight implements Courier {

	@Override
	public String deliver(int oid) {
		return "Items wiil deliver "+oid+" with First Flight";
	}

}
