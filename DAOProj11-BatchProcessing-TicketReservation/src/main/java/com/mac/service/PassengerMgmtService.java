package com.mac.service;

import java.util.List;

import com.mac.dto.PassengerDTO;

public interface PassengerMgmtService {

	public String ticketBooking(List<PassengerDTO> listDTO);
}
