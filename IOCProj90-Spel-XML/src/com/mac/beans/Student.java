package com.mac.beans;

import java.util.List;

import lombok.Data;

@Data
public class Student {

	private int regNo;
	private String name;
	private String domain;
	private String[] courses;
	private List<String> faculties;
	private int totalDuration;
	private float fees;
	private float totalFees;
}
