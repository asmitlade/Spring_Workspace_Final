package com.mac.beans;

public class ITCompany {
	private String dept;
	private int empCount;
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	@Override
	public String toString() {
		return "ITCompany [dept=" + dept + ", empCount=" + empCount + "]";
	}
}
