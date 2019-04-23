package com.nt.beans;

public class WishMessageGenerator {

	public WishMessageGenerator() {
		System.out.println("0-param constructor");
	}
	public WishMessageGenerator(int a, int b) {
		System.out.println("2-param constructor");
		int c = a+b;
		System.out.println("Result :::"+c);
	}
	
	
}