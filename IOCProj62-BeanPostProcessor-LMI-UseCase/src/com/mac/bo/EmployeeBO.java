package com.mac.bo;

public class EmployeeBO extends BaseBO {
	private String desg;

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "EmployeeBO [name=" + getName() + ", email=" + getEmail() + ", address=" + getAddress() + ", mobNo=" + getMobNo() + ", doj="
				+ getDoj() + "]";
	}

}
