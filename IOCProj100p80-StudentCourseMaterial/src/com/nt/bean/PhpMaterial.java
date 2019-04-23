package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("php")
public class PhpMaterial implements Material {

	
	@Override
	public String material(String course) {
			return "PHP course Material";
	}

}
