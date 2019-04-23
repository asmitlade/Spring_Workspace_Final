package com.nt.bean;

import javax.inject.Named;



@Named("java")
public class JavaMaterial implements Material{

	@Override
	public void material(String Course) {
		System.out.println("Java Course material");
	}

}
