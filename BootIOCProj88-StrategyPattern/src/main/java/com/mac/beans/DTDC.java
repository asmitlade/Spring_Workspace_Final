package com.mac.beans;

import org.springframework.stereotype.Component;

@Component("courier")
public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		return "Items wiil deliver "+oid+" with DTDC";
	}

}
