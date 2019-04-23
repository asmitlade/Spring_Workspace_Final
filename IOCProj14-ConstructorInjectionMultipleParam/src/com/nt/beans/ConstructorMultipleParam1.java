package com.nt.beans;

public class ConstructorMultipleParam1 {
	private int mark1;
	private int  mark2;
	private int mark3;
	public ConstructorMultipleParam1(int mark1, int mark2, int mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	@Override
	public String toString() {
		return "ConstructorMultipleParam1 [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + "]";
	}
	
}
