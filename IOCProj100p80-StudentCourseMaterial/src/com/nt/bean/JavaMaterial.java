package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaMaterial implements Material{
	
	@Override
	public String material(String course) {
			return "java course Material";
	}

}
