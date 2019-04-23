package com.nt.bo;

public class StudentBO {
	private int sno;
	private String sname;
	private String saddrs;
	private int total;
	private float avg;
	private String result;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddrs() {
		return saddrs;
	}
	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}