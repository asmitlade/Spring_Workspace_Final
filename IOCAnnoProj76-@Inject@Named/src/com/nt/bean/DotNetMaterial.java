package com.nt.bean;

import javax.inject.Named;

@Named("dnet")
public class DotNetMaterial implements Material {
	
	@Override
	public void material(String course) {
		System.out.println(".net course material");
	}
}
