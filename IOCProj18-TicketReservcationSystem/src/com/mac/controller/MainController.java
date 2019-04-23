package com.mac.controller;

import com.mac.dto.PassangerDTO;
import com.mac.service.PassangerService;
import com.mac.vo.PassangerVO;

public class MainController {
	private PassangerService service;

	public MainController(PassangerService service) {
		this.service = service;
	}
	public String process(String source, String destination) {
		PassangerVO vo = new PassangerVO();
		PassangerDTO dto = new PassangerDTO();
		vo.setSource(source);
		vo.setDestination(destination);
		// convert vo object to dto object
		dto.setSource(vo.getSource());
		dto.setDestination(vo.getDestination());
		String result = service.generateTicket(dto);
		return result;
	}//method
}//class
