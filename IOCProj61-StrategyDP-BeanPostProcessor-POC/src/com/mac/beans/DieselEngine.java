package com.mac.beans;

public class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DieselEngine : 0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine : start()");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine : stop()");
	}

}
