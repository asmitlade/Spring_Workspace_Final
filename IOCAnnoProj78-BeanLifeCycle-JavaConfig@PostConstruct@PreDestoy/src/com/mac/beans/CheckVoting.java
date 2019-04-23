package com.mac.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vote")
public class CheckVoting {

	@Value("Asmit Lade")
	private String name;
	@Value("Ghanod")
	private String addr;
	@Value("26")
	private int age;
	
	@PostConstruct
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
	
	@PreDestroy
	//custom destroy method
	public void myDestroy() {
		System.out.println("Bean custome Destroy(-)");
		name = null;
		addr = null;
		age = 0;
	}

}
