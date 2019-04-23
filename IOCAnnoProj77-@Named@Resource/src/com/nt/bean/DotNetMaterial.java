package com.nt.bean;

import javax.inject.Named;

@Named("dnet")
public class DotNetMaterial implements Material {
	
	@Override
	public String material(String course) {
		return ".net course material";
	}
}
