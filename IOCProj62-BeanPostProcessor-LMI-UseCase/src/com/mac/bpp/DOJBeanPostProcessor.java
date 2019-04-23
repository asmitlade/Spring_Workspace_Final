package com.mac.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mac.bo.BaseBO;

public class DOJBeanPostProcessor implements BeanPostProcessor {

	public DOJBeanPostProcessor() {
		System.out.println("DOJBeanPostProcessor : 0-param constructor");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId)throws BeansException{
		System.out.println("DOJBeanPostProcessor.postProcessBeforeInitialzation(-,-)");
		if(bean instanceof BaseBO) {
			((BaseBO) bean).setDoj(new Date());
		}
		return bean;
	}
}

