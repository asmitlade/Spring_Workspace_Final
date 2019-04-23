package com.mac.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CheckVoting implements InitializingBean, DisposableBean {

	@SuppressWarnings("unused")
	private String name, addr;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//custom init method
	public void check() {
		if(name=="" || age<=0) {
			throw new IllegalArgumentException("Please Enter Name and Age Correctly ::");
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if(age<=0 || name=="") 
			throw new IllegalArgumentException("Please Enter valid Name and Age");
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

	@Override
	public void destroy() throws Exception {
		name = null;
		addr = null;
		age = 0;
	}

}
