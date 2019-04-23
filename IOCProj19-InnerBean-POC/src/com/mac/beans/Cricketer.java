package com.mac.beans;

public class Cricketer {
	private Bat bat;

	public Cricketer(Bat bat) {
		this.bat = bat;
	}

	@Override
	public String toString() {
		return "Cricketer::\n"+bat;
	}
}
