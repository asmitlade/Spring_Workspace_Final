package com.nt.beans;

public class Demo {
	private Demo() {
		System.out.println("0-param constructor");
	}
	private Demo(int x, int y) {
		System.out.println("2-param constructor");
	}
	public int sum(int x, int y) {
		return x+y;
	}
}
