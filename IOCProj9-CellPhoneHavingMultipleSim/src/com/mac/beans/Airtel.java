package com.mac.beans;

public class Airtel implements SimCard {

	@Override
	public void insertSimCard() {
		System.out.println("You Inserted Airtel Sim Card");
	}

	@Override
	public void makeCall() {
		System.out.println("You have choose Airtel Service for calling");
	}

	@Override
	public void sendMsg() {
		System.out.println("Your have choose Airtel Serive for Sending Messaging");
	}
}//class