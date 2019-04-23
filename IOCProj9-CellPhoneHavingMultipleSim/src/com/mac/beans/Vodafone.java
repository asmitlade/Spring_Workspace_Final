package com.mac.beans;

public class Vodafone implements SimCard {

	@Override
	public void insertSimCard() {
		System.out.println("You Inserted Vodafone Sim Card");
	}

	@Override
	public void makeCall() {
		System.out.println("You have choose Vodafone Service for calling");
	}

	@Override
	public void sendMsg() {
		System.out.println("Your have choose Vodafone Serive for Sending Messaging");
	}
}//class