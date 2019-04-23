package com.mac.beans;

public class Bat {
	private String brand;
	private String name;
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bat Brand ::"+brand+"\nPlayer Belongs To ::"+name;
	}
}
