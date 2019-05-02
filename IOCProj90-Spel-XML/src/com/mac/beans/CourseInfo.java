package com.mac.beans;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CourseInfo {
	
	private String institute;
	private List<String> avaliablecourses;
	private String[] availableFaculties;
	private Map<String, Integer> courseDurations;
	private Map<String, Integer> prices;
	private int discount;
}
