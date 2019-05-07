package com.mac.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("st")
@PropertySource("classpath:com/mac/commons/info.properties")
public class Student {

	@Value("#{T(java.lang.Math).random()*100}")
	private int regNo;
	
	@Value("#{'${st.name}'}")
	private String name;
	
	@Value("#{'${st.domain}'}")
	private String domain;
	
	@Value("#{T(java.util.Arrays).asList(crs.avaliablecourses[0],crs.avaliablecourses[1],crs.avaliablecourses[2],crs.avaliablecourses[3])}")
	private String[] courses;
	
	@Value("#{T(java.util.Arrays).asList(crs.availableFaculties[0],crs.availableFaculties[2])}")
	private List<String> faculties;
	
	@Value("#{crs.courseDurations['CoreJava']+crs.courseDurations['AdvJava']+crs.courseDurations['Spring']+crs.courseDurations['Hibernate']}")
	private int totalDuration;
	
	@Value("#{crs.prices['CoreJava']+crs.prices['AdvJava']+crs.prices['Spring']+crs.prices['Hibernate']}")
	private float fees;
	
	@Value("#{(crs.prices['CoreJava']+crs.prices['AdvJava']+crs.prices['Spring']+crs.prices['Hibernate'])-(crs.prices['CoreJava']+crs.prices['AdvJava']+crs.prices['Spring']+crs.prices['Hibernate'])*(crs.discount/100.0f)}")
	private float totalFees;
}
