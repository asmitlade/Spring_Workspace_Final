package com.mac.beans;

public class CNGEngine implements Engine {

	public CNGEngine() {
		System.out.println("CNGEngine : 0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("CNGEngine : start()");
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine : stop()");
	}

}
