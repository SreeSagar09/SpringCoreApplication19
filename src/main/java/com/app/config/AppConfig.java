package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.app"})
@PropertySource(value = {"classpath:Student.properties", "classpath:Course.properties", "classpath:Address.properties", "classpath:Employee.properties", "classpath:App.properties"}, ignoreResourceNotFound = true)
public class AppConfig {
	
}
