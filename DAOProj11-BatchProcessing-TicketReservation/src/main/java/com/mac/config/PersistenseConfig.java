package com.mac.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.mac.dao")
public class PersistenseConfig {

	@Bean(name="hikariDS")
	public DataSource createDS() {
		HikariDataSource hikari = null;
		hikari = new HikariDataSource();
		hikari.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hikari.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hikari.setUsername("system");
		hikari.setPassword("manager");
		return hikari;
	}
	
	@Bean(name="template")
	public JdbcTemplate getJT() {
		return new JdbcTemplate(createDS());
	}
}
