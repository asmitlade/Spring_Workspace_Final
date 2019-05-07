package com.mac.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.mac.dao")
@PropertySource("classpath:com/mac/commons/jdbc.properties")
public class PersistenceConfig {

	@Autowired
	private Environment env;
	
	@Bean(name="hikariDS")
	public DataSource createDS() {
		HikariDataSource ds = null;
		ds = new HikariDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		ds.setJdbcUrl(env.getProperty("jdbc.JdbcUrl"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		return ds;
	}
	
	@Bean(name="jt")
	public JdbcTemplate jt() {
		return new JdbcTemplate(createDS());
	}
}
