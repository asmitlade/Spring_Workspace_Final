package com.nt.bean;

public class Student {
	
	private int sno;
	private String sname;
	private String course;
	private Material material1;
	public Student(Material material1) {
		this.material1 = material1;
	}
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setMaterial(Material material1) {
		this.material1 = material1;
	}
	public Material getMaterial() {
		return material1;
	}
	public void display() {
		System.out.println("Student No. :::"+this.getSno()+"\nStudent Name :::"+
				this.getSname()+" "+"is take a admision on "+" "+ this.getCourse()+
				"\nPlease provide the"+this.getMaterial());
	}
}
