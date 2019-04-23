package com.mac.beans;

public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat:CricketBat()");
	}
	
	public double run() {
		return Math.round(Math.random()*100);
	}
}
