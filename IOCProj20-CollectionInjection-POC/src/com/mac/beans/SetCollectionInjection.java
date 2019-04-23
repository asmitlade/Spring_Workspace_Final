package com.mac.beans;

import java.util.Set;

public class SetCollectionInjection {
	private Set<Long> mobNo;

	public void setMobNo(Set<Long> mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "SetCollectionInjection [mobNo=" + mobNo + "]";
	}
}
