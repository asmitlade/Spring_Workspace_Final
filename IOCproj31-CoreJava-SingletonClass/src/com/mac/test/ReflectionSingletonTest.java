package com.mac.test;

import java.lang.reflect.Constructor;

import com.mac.singleton.Printer;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		Printer pntr1=null, pntr2=null;
		Constructor cons[]=null;
		try {
			//create object using Reflection api by accessing private constructor
			//load class
			Class c = Class.forName("com.mac.singleton.Printer");
			//get access to all constructor
			cons = c.getDeclaredConstructors();
			//get access to private constructor
			cons[0].setAccessible(true);
			pntr2 = (Printer) cons[0].newInstance(null);
			System.out.println(pntr1.getInstance().hashCode());
			System.out.println(pntr2.getInstance().hashCode());
			System.out.println("pntr1 == pntr2?"+(pntr1==pntr2));
		}//try 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
