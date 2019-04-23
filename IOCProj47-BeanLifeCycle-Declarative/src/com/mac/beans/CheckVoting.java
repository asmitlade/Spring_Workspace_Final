package com.mac.beans;


public class CheckVoting {

	@SuppressWarnings("unused")
	private String name, addr;
	private int age;
	
	//custom init method
	public void check() {
		if(name=="" || age<=0) {
			throw new IllegalArgumentException("Please Enter Name and Age Correctly ::");
		}
	}
	
	public String checkVoting() {
		if(age>=18) 
			return name+" you are eligible for voting";
		else 
			return name+" you are not eligible for voting";
	}
	//custom destroy method
	public void myDestroy() {
		System.out.println("Bean custome Destroy(-)");
		name = null;
		addr = null;
		age = 0;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
