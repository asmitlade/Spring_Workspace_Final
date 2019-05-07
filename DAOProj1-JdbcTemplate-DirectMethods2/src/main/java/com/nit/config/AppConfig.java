package com.nit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.nit.dao", "com.nit.service"})
@PropertySource(value = "com/nit/commons/jdbc.properties")
public class AppConfig {

	@Autowired
	private Environment env;
	
	@Bean(name="hikariDS")
	public HikariDataSource createDS() {
		HikariDataSource hikariDS = null;
		hikariDS = new HikariDataSource();
		hikariDS.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		hikariDS.setJdbcUrl(env.getProperty("jdbc.JdbcUrl"));
		hikariDS.setUsername(env.getProperty("jdbc.username"));
		hikariDS.setPassword(env.getProperty("jdbc.password"));
		return hikariDS;
	}

	@Bean(name="jt")
	public JdbcTemplate jt() {
		return new JdbcTemplate(createDS());
	}
}
