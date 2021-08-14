package org.stackroute.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.stackroute.javaconfig")
public class javaConfig {
	
	@Bean
	public City getCity() {
		return new City();
	}
	
	@Bean
	public Student getStudent() {
		//create new object
		Student stud = new Student(getCity());
		
		return stud;
	}
}
