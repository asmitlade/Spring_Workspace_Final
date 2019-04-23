package com.mac.singleton;

public class Printer {
	private static Printer instance;
	private static boolean instantiated;
	
	private Printer() throws Exception{
		if(instantiated)
			throw new Exception("Object already created");
		else
			instantiated = true;
	}
	
	public static Printer getInstance() throws Exception{
		if(instance==null)
			instance = new Printer();
		return instance;
	}
	
	public void print() {
		System.out.println("Printing on paper.......");
	}
}
