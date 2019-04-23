package com.mac.beans;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alarm {
	private Calendar dob;

	public Alarm(Calendar dob) {
		this.dob = dob;
		//System.out.println(this.dob);
	}
	
	public String remainder() {
		Calendar sysDate = new GregorianCalendar();
		sysDate.getTime();
		//System.out.println(sysDate);
		if(sysDate.get(Calendar.MONTH)==dob.get(Calendar.MONTH) && sysDate.get(Calendar.DATE)==dob.get(Calendar.DATE))
			return "Happy Birth Day ... Asmit";
		else
			return "No remainder today";
	}
}
