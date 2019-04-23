package com.mac.bo;

import java.util.Date;

public abstract class BaseBO {
	private String name;
	private String email;
	private String address;
	private long mobNo;
	private Date doj;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "BaseBO [name=" + name + ", email=" + email + ", address=" + address + ", mobNo=" + mobNo + ", doj="
				+ doj + "]";
	}
}
