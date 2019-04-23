package com.mac.locator;

import java.util.HashMap;

import java.util.Map;


import com.mac.external.ExternalIPLScoreComp;
import com.mac.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean  {

	private static Map<String, ExternalIPLScoreComp> cacheMap = new HashMap<String, ExternalIPLScoreComp>();
	
	public static ExternalIPLScoreComp getExtService(String jndi) {
		ExternalIPLScoreComp extComp = null;
		if(!cacheMap.containsKey(jndi)) {
			extComp = new ExternalIPLScoreCompImpl();
			cacheMap.put(jndi, extComp);
		}
		return cacheMap.get(jndi);
	}
}
