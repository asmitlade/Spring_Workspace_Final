package com.mac.beans;

import java.util.Map;

public class Institute {
	private Map<String, String> faculty;

	public void setFaculty(Map<String, String> faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Institute [faculty=" + faculty + "]";
	}
}
