package com.mac.cfgs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {ServiceConfig.class,PersistenceAppConfig.class})
public class AppConfig {

}
