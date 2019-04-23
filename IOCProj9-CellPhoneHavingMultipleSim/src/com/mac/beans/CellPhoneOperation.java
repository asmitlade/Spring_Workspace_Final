package com.mac.beans;

import java.util.Scanner;

public class CellPhoneOperation {
	private SimCard sim;
	private Scanner sc;
	private int choice;
	public CellPhoneOperation(SimCard sim) {
		System.out.println("CellPhoneOperation:1-param constructor");
		this.sim = sim;
	}//constructor
	public void cellOp() {
		sc = new Scanner(System.in);
		System.out.println("Choose Operation :::");
		System.out.println("1. Insert Sim Card");
		System.out.println("2. Make a Call");
		System.out.println("3. Send Message");
		System.out.println("4. Exit");
		System.out.println("Enter Your Choice:: ");
		choice = sc.nextInt();
		switch(choice) {
			case 1:
				sim.insertSimCard();
				break;
			case 2:
				sim.makeCall();
				break;
			case 3:
				sim.sendMsg();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid Option");
		}//switch
	}//cellOp
}//class