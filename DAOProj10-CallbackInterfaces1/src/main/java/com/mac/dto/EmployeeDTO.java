package com.mac.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private int empNo;
	private String ename;
	private String job;
	private int sal;
}
