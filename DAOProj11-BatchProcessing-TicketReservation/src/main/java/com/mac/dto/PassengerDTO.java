package com.mac.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PassengerDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String source;
	private String dest;
	private float price;
}
