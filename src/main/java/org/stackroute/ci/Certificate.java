package org.stackroute.ci;

public class Certificate {
	private String name ;
	private String grade;
	
	public Certificate(String name , String grade) {
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return this.name+" "+this.grade;
	}
	
}
