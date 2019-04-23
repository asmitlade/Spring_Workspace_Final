package com.mac.beans;

public class Veichle {
	private Engine engg;
	
	public Veichle() {
		System.out.println("Veichle : 0-param constructor");
	}
	public void setEngg(Engine engg) {
		this.engg = engg;
	}
	
	public void journey(String sourcePlace, String destPlace) {
		engg.start();
		System.out.println("Veichle is moving....");
		engg.stop();
		System.out.println(sourcePlace+" to "+destPlace+"journey complete.");
	}
}
