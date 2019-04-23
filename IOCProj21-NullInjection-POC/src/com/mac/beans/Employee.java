package com.mac.beans;

import java.util.Date;

public class Employee {
	private int empNo;
	private String ename;
	private Date dob;
	private Date doj;
	private Date dom;
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
}
