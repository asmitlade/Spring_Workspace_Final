package com.nt.bean;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("student")
public class Student {

	@Value("${student.sno}")
	private int sno;
	@Value("${student.sname}")
	private String sname;
	@Value("${student.course}")
	private String course;
	@Inject
	@Named("java")
	private Material material;
	
	/*public Student(Material material) {
		this.material = material;
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
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Material getMaterial() {
		return material;
	}*/
	/*public void display() {
		System.out.println("Student No. :::"+this.getSno()+"\nStudent Name :::"+
				this.getSname()+" "+"is take a admision on "+" "+ this.getCourse()+
				"\nPlease provide the"+this.getMaterial());
	}*/
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", material=" + material.toString() + "]";
	}
	
	
}
