package com.mac.beans;

public class CricketBat {
	private ProffessionalCricketer pct;  
	public double run() {
		return Math.round(Math.random()*100);
	}
	
	public void setPct(ProffessionalCricketer pct) {
		this.pct = pct;
	}
}
