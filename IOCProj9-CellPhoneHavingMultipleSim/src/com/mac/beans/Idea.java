package com.mac.beans;

public class Idea implements SimCard {

	@Override
	public void insertSimCard() {
		System.out.println("You Inserted Idea Sim Card");
	}

	@Override
	public void makeCall() {
		System.out.println("You have choose Idea Service for calling");
	}

	@Override
	public void sendMsg() {
		System.out.println("Your have choose Idea Serive for Sending Messaging");
	}
}//class