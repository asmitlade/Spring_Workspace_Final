package com.mac.beans;

public class Bike {
	private String bikeNo;
	private long enginNo;
	private String ownerName;
	private String vendor;
	private String brand;
	private String colour;
	private String enginType;
	private String enginCc;
	private String initialSpeed;
	private String tankCapacity;
	
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public void setEnginNo(long enginNo) {
		this.enginNo = enginNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setEnginType(String enginType) {
		this.enginType = enginType;
	}
	public void setInitialSpeed(String initialSpeed) {
		this.initialSpeed = initialSpeed;
	}
	public void setTankCapacity(String tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public void setEnginCc(String enginCc) {
		this.enginCc = enginCc;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", \nenginNo=" + enginNo + ", \nownerName=" + ownerName + ", \nvendor=" + vendor
				+ ", \nbrand=" + brand + ", \ncolour=" + colour + ", \nenginType=" + enginType + ", \nenginCc=" + enginCc
				+ ", \ninitialSpeed=" + initialSpeed + ", \ntankCapacity=" + tankCapacity + "]";
	}
}
