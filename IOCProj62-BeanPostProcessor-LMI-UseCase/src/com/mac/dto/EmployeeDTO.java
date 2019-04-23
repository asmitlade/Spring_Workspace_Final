package com.mac.dto;

public class EmployeeDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	private String desg;
	
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
