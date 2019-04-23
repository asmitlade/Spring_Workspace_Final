package com.mac.dto;

import java.io.Serializable;

public class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String email;
	private String address;
	private long mobNo;
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
