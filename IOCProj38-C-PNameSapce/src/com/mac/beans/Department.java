package com.mac.beans;

import java.util.Date;

public class Department {
	private int deptno;
	private String name;
	private Date doj;
	public Department(int deptno, String name, Date doj) {
		System.out.println("Department:: 3-param construction(-)");
		this.deptno = deptno;
		this.name = name;
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", name=" + name + ", doj=" + doj + "]";
	}
}