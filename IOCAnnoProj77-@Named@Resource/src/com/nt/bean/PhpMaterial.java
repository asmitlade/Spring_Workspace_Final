package com.nt.bean;

import javax.inject.Named;

@Named("php")
public class PhpMaterial implements Material {

	@Override
	public String material(String course) {
		return "PHP course Material";
	}

}
