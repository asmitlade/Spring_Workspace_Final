package com.mac.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMsgGenerator {
	
	@Autowired(required=true)
	private Calendar calendar;
	
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

	@Override
	public String toString() {
		return "WishMsgGenerator [calendar=" + calendar + "]";
	}
	
}
