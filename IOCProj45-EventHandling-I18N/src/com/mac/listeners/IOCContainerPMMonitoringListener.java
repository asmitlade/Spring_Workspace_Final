package com.mac.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IOCContainerPMMonitoringListener implements ActionListener {
	private long start,end;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.toString().contains("Refreshed")) {
			start = System.currentTimeMillis();
		}
		else if(e.toString().contains("Closed")) {
			end = System.currentTimeMillis();
		}
		System.out.println("IOC Container has stayed in execution ::"+(end-start)+"ms");
	}//method
}//class
