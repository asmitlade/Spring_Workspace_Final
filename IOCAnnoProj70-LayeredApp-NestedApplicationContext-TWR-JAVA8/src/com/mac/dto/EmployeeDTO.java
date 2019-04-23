package com.mac.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	private static final long serialVersionUID = 4858892159515580230L;
	private int empno;
	private String ename;
	private String desg;
	private int salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
