package com.mac.bo;

public class PassangerBO {
	private String pname;
	private String source;
	private String destination;
	private double amount;
	private int ticket;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
}
