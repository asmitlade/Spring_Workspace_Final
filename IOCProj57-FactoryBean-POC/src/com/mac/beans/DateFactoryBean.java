package com.mac.beans;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Calendar> {

	private int year;
	private int month;
	private int day;
	
	public DateFactoryBean(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	@Override
	public Calendar getObject() throws Exception {
		System.out.println("DateFactoryBean::getObject()");
		return new GregorianCalendar(year-1900,month-1,day);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean :: getObjectType()");
		return Calendar.class;
	}
	/*@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean :: isSingleton()");
		return true;
	}*/
}
