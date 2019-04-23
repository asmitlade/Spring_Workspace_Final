package com.mac.service;

import java.util.Scanner;

import com.mac.bo.PassangerBO;
import com.mac.dto.PassangerDTO;
import com.nt.dao.PassangerDAO;

public class PassangerServiceImpl implements PassangerService {
	private PassangerDAO dao;
	public PassangerServiceImpl(PassangerDAO dao) {
		this.dao = dao;
	}
	@Override
	public String generateTicket(PassangerDTO dto) {
		int initRate = 12;
		PassangerBO bo = null;
		boolean cnt;
		int ticket=0;
		try(Scanner sc= new Scanner(System.in)){
			double amt = initRate*+23;
			ticket=(int)(Math.random()*50+1);
			bo = new PassangerBO();
			bo.setSource(dto.getSource());
			bo.setDestination(dto.getDestination());
			bo.setTicket(ticket);
			bo.setAmount(amt);
			cnt =dao.insert(bo);
			if(cnt == false)
				return "Ticket Reservation Failed";
			else
				return "Ticket Reserverd"+" \nTotal Amount:: "+bo.getAmount()+"\nTicket No. ::"+bo.getTicket();
		}//try
	}//method
}//class
