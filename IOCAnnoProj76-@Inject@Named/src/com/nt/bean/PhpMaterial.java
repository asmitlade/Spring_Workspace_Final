package com.nt.bean;

import javax.inject.Named;

@Named("php")
public class PhpMaterial implements Material {

	@Override
	public void material(String course) {
		System.out.println("PHP course Material");
	}

}
