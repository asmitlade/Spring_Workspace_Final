package com.nt.bean;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	@Value("2222")
	private int sno;
	@Value("Asmit Lade")
	private String sname;
	@Value("java")
	private String course;
	@Inject
	@Named("java")
	private Material material1;
	

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

	public Material getMaterial1() {
		return material1;
	}

	public void setMaterial1(Material material1) {
		this.material1 = material1;
	}

	public void display() {
		System.out.println("Student No. :::"+this.getSno()+"\nStudent Name :::"+
				this.getSname()+" "+"is take a admision on "+" "+ this.getCourse()+
				"\nPlease provide the  : "+this.material1.material(this.getCourse()));
	}
}
