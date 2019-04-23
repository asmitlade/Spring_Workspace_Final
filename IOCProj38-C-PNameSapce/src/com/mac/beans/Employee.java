package com.mac.beans;

public class Employee {
	private int empNo;
	private String ename;
	private Department dept;
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", dept=" + dept + "]";
	}
}
