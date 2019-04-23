package org.mac.test;

import org.mac.beans.PropsTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		PropsTestBean props = null;
		ctx = new ClassPathXmlApplicationContext("org/mac/cfgs/applicationContext.xml");
		props = ctx.getBean("propsTestBean", PropsTestBean.class);
		System.out.println(props);
		((AbstractApplicationContext) ctx).close();
	}

}
