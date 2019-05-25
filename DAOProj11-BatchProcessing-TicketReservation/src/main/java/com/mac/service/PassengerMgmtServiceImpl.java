package com.mac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mac.bo.PassengerBO;
import com.mac.dao.PassengerDAO;
import com.mac.dto.PassengerDTO;

@Service("pService")
public class PassengerMgmtServiceImpl implements PassengerMgmtService {

	@Autowired
	private PassengerDAO dao;
	
	public String ticketBooking(List<PassengerDTO> listDTO) {
		List<PassengerBO> listBO = new ArrayList<PassengerBO>();
		listDTO.forEach(dto->{
			PassengerBO bo = new PassengerBO();
			bo.setName(dto.getName());
			bo.setSource(dto.getSource());
			bo.setDest(dto.getDest());
			bo.setPrice(dto.getPrice());
		});
		int result[] = dao.insert(listBO);
		if(result!=null)
			return "Ticket Booking Successded";
		else
			return "Ticket Booking Failed";
	}
}
