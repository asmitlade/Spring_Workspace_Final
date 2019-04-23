package org.mac.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component

/*@PropertySource(value="classpath:org/mac/commons/info.properties")
@PropertySource(value="classpath:org/mac/commons/info1.properties") */

@PropertySources(value= {@PropertySource(value="classpath:org/mac/commons/info.properties"),
		@PropertySource(value="classpath:org/mac/commons/info1.properties")})
public class PropsTestBean {
	
	@Value("${user.uname}")
	private String uname;
	@Value("${user.address}")
	private String address;
	@Value("${mobNo}")
	private long mobNo;
	@Value("${os.name}")
	private String osname;
	@Value("${JAVA_HOME}")
	private String javahome;
	@Override
	public String toString() {
		return "PropsTestBean [uname=" + uname + ", address=" + address + ", mobNo=" + mobNo + ", osname=" + osname
				+ ", javahome=" + javahome + "]";
	}
	
}
