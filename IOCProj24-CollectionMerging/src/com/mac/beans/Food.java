package com.mac.beans;

import java.util.List;
import java.util.Set;

public class Food {
	private Set<String> veg;
	private List<String> nonVeg;
	public void setVeg(Set<String> veg) {
		this.veg = veg;
	}
	public void setNonVeg(List<String> nonVeg) {
		this.nonVeg = nonVeg;
	}
	@Override
	public String toString() {
		return "Food [veg=" + veg + ", nonVeg=" + nonVeg + "]";
	}
}
