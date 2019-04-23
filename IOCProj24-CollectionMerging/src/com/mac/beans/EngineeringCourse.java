package com.mac.beans;

import java.util.Set;

public class EngineeringCourse {
	private Set<String> subject;

	public void setSubject(Set<String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "EngineeringCourse [subject=" + subject + "]";
	}
}