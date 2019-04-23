package com.nt.bean;

import javax.inject.Named;



@Named("java")
public class JavaMaterial implements Material{

	@Override
	public String material(String Course) {
		return "Java Course material";
	}

}
