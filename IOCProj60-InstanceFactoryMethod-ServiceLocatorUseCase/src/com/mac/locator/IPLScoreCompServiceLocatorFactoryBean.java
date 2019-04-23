package com.mac.locator;

import java.util.HashMap;

import java.util.Map;


import com.mac.external.ExternalIPLScoreComp;
import com.mac.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean  {

	private Map<String, ExternalIPLScoreComp> cacheMap = new HashMap<String, ExternalIPLScoreComp>();
	
	public ExternalIPLScoreComp getService(String jndi) {
		if(!cacheMap.containsKey(jndi)) {
			cacheMap.put(jndi, new ExternalIPLScoreCompImpl());
		}
		return cacheMap.get(jndi);
	}
}
