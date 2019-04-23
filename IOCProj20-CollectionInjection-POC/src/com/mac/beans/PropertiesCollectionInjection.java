package com.mac.beans;

import java.util.Properties;

public class PropertiesCollectionInjection {
	private Properties empDesg;

	public void setEmpDesg(Properties empDesg) {
		this.empDesg = empDesg;
	}

	@Override
	public String toString() {
		return "PropertiesCollectionInjection [empDesg=" + empDesg + "]";
	}
}
