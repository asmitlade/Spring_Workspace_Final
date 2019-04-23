package com.nt.beans;

public class ConstructorMultipleParam2 {
	private int empNo;
	private String ename;
	private float sal;

	public ConstructorMultipleParam2(int empNo, String ename, float sal) {
		this.empNo = empNo;
		this.ename = ename;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "ConstructorMultipleParam2 [empNo=" + empNo + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
}//class