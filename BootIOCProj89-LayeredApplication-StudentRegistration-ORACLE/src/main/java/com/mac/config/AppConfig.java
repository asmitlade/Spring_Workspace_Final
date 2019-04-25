package com.mac.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages="com.mac.controller")
@Import(value={PersistenceAppConfig.class,ServiceAppConfig.class})
public class AppConfig {

}

