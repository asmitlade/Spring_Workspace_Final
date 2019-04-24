package com.mac.beans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {
		return "Items wiil deliver "+oid+" with BluDart";
	}

}
