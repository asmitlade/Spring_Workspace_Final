package com.mac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mac.dao")
public class PersistenceConfig {

	/*
	 * @Autowired private Environment env;
	 * 
	 * @Bean(name="hikariDS") 
	 * public DataSource createDS() { 
	 * HikariDataSource ds =null;
	 * ds = new HikariDataSource();
	 * ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
	 * ds.setJdbcUrl(env.getProperty("jdbc.JdbcUrl"));
	 * ds.setUsername(env.getProperty("jdbc.username"));
	 * ds.setPassword(env.getProperty("jdbc.password")); return ds; }
	 * 
	 * @Bean(name="jt") public JdbcTemplate jt() { return new
	 * JdbcTemplate(createDS()); }
	 */
}
