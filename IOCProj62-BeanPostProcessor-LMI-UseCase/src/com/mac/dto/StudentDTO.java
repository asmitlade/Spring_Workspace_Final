package com.mac.dto;

public class StudentDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	private String course;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
