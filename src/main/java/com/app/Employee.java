package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"classpath:Employee.properties"})
public class Employee {
	@Value("${employee.empId}")
	private Integer empId;
	
	@Value("${employee.empName}")
	private String empName;
	
	@Value("${employee.age}")
	private Integer age;
	
	@Value("${employee.designation}")
	private String designation;
	
	@Value("${employee.salary}")
	private Double salary;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	
}
