package com.mac.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMsgGenerator {
	
	private Calendar calendar;
	
	@Autowired(required=true)
	@Qualifier("cal1")
	public String generate(String user) {
		int hour = 0;
		//create Calendar object
		calendar =  Calendar.getInstance();
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "Good Morning ::"+user;
		else if(hour<16)
			return "Good Afternoon ::"+user;
		else if(hour<20)
			return "Good Evening ::"+user;
		else 
			return "Good Night ::"+user;
	}
}
