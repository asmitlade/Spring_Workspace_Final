package com.mac.test;

import com.mac.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer pntr1 = null, pntr2 = null;
		try {
			pntr1 = Printer.getInstance();
			pntr2 = Printer.getInstance();
			System.out.println(pntr1.hashCode()+"  "+pntr2.hashCode());
			System.out.println("pntr1 == pntr2?"+(pntr1==pntr2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
