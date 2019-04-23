package com.nt.bean;

import org.springframework.stereotype.Component;

@Component("dnet")
public class DotNetMaterial implements Material {

	@Override
	public String material(String course) {
			return ".net course Material";
	}
}
