package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.beans.Demo;

public class ReflectionAPITest {
	public static void main(String[] args) throws Exception{
		Constructor cons[] = null;
		Demo d1 = null, d2 = null;
		Class c = null;
		//load the class name
		c = Class.forName("com.nt.beans.Demo");
		// load all the Constructor
		cons = c.getDeclaredConstructors();
		//get access to private constructor
		cons[0].setAccessible(true);
		cons[1].setAccessible(true);
		// create Objects
		d1 = (Demo) cons[0].newInstance();
		System.out.println("d1 ::"+d1.sum(10,11));
		System.out.println("=========================");
		d2 = (Demo) cons[1].newInstance(10,20);
		System.out.println("Sum ::"+d2.sum(12, 12));
	}//main
}//class