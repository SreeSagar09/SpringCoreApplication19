package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:Address.properties"})
public class Address {
	
	@Autowired
	private Environment environment;
	
	private String houseNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String zipcode;
	
	@Override
	public String toString() {
		houseNo = environment.getProperty("address.houseNo");
		area = environment.getProperty("address.area");
		city = environment.getProperty("address.city");
		state = environment.getProperty("address.state");
		country = environment.getProperty("address.country");
		zipcode = environment.getProperty("address.zipcode");
		
		return "Address [houseNo=" + houseNo + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipcode=" + zipcode + "]";
	}
	
}
