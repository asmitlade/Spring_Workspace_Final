package com.mac.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	
	private float rate;
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		float pamt = 0.0f;
		float time = 0.0f;
		
		System.out.println("IntrRateReplacer.reimplement(-,-,-)");
		System.out.println("Class name ::"+obj.getClass());
		System.out.println("Method name ::"+method.getName());
		System.out.println("Method args ::"+Arrays.toString(args));
		
		pamt = (float)args[0];
		time = (float)args[1];
		
		return pamt*time*rate/100.0f;
	}
	

}
