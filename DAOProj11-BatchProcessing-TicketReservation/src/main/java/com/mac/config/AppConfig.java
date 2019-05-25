package com.mac.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {PersistenseConfig.class, ServiceConfig.class})
public class AppConfig {

}
