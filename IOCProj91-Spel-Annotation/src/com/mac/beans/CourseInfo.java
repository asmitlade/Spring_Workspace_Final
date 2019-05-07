package com.mac.beans;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("ci")
@PropertySource("classpath:com/mac/commons/info.properties")
public class CourseInfo {

	@Value("#{'${crs.institute}'}")
	private String institute;
	
	@Value("#{'${crs.avaliablecourses}'.split(',')}")
	private List<String> avaliablecourses;
	
	@Value("#{'${crs.availableFaculties}'.split(',')}")
	private String[] availableFaculties;
	
	@Value("#{${crs.courseDurations}}")
	private Map<String, Integer> courseDurations;
	
	@Value("#{${crs.prices}}")
	private Map<String, Integer> prices;
	
	@Value("#{'${crs.discount}'}")
	private int discount;
}
