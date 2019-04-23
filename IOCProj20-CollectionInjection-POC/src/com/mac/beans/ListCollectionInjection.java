package com.mac.beans;

import java.util.List;

public class ListCollectionInjection {
	private List<String> sname;

	public void setSname(List<String> sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "ListCollectionInjection [sname=" + sname + "]";
	}
}
