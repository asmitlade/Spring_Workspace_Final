package com.nt.beans;

public class ConstructorMultipleParam {
	private int custNo;
	private String custName;
	private float salary;
	public ConstructorMultipleParam(int custNo, String custName, float salary) {
		this.custNo = custNo;
		this.custName = custName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ConstructorMultipleParam \n[custNo=" + custNo + ", \ncustName=" + custName + ", \nsalary=" + salary + "]";
	}
}
