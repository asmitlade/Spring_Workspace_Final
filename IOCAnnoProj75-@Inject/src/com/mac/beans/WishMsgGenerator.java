package com.mac.beans;

import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Named;

public class WishMsgGenerator {
	
	
	@Inject
	@Named("cal")
	private Calendar calendar;
	
	/*@Inject
	@Named("cal1")
	public void assign(Calendar calendar) {
		this.calendar = calendar;
	}*/
	public String generate(String user) {
		int hour = 0;
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
