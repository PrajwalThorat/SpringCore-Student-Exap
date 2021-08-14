package org.stackroute.javaconfig;


public class Student {
	
	private City city;

	public Student(City city) {
		super();
		this.city = city;
	}

	public void studentWork() {
		this.city.cityName();
		System.out.println("Student Reading a Book");
	}
	

}
