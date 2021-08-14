package org.stackroute.ref;

public class School {
	private Student student;
	
	public School() {
		
	}
	

	public School(Student student) {
		super();
		this.student = student;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "School [student=" + student + "]";
	}
	
	
}
