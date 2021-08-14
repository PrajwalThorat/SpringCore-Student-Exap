package org.stackroute.component.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student  {
	@Value("flash")
	private String studentName;
	@Value("New-York")
	private String studentCity;
	@Value("22")
	private int studentAge;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public void StudentInfo() {
		System.out.println("Name :"+this.studentName+"\nCity : "+this.studentCity+"\nAge : "+this.studentAge);
	}
}
