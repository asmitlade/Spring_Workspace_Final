package com.mac.beans;

import java.util.Date;

public class Student {
	private int sno;
	private String sname;
	private Date dob;
	private Date doj;
	private Date dom;
	
	public Student(int sno, String sname, Date dob, Date doj, Date dom) {
		this.sno = sno;
		this.sname = sname;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
}
