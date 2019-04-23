package com.mac.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.mac.external.ExternalIPLScoreComp;
import com.mac.external.ExternalIPLScoreCompImpl;

public class IPLScoreCompServiceLocatorFactoryBean implements FactoryBean<ExternalIPLScoreComp> {

	Map<String, ExternalIPLScoreComp> cacheMap = null;
	String jndi = null;
	
	public IPLScoreCompServiceLocatorFactoryBean(String jndi) {
		this.jndi = jndi;
		cacheMap = new HashMap<String, ExternalIPLScoreComp>();
	}
	@Override
	public ExternalIPLScoreComp getObject() throws Exception {
		ExternalIPLScoreComp extComp = null;
		if(!cacheMap.containsKey(jndi)) {
			extComp = new ExternalIPLScoreCompImpl();
			cacheMap.put(jndi, extComp);
		}
		return cacheMap.get(jndi);
	}

	@Override
	public Class<?> getObjectType() {
		return ExternalIPLScoreComp.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
