package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("${student.sId}")
	private Integer sId;
	
	@Value("${student.sName}")
	private String sName;
	
	@Value("${student.age}")
	private Integer age;
	
	@Value("${course.courseName}")
	private String courseName;
	
	@Value("${course.courseFee}")
	private Double courseFee;
	
	@Value("${course.courseDuration}")
	private String courseDuration;
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", age=" + age + ", courseName=" + courseName
				+ ", courseFee=" + courseFee + ", courseDuration=" + courseDuration + "]";
	}
	
}
