package org.stackroute.ci;

public class Person {
	private String name;
	private int age;
	private Certificate certificate ;
	
	public Person(String name , int age , Certificate certificate) {
		this.name = name;
		this.age = age ;
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Name : "+this.name+"Age : "+this.age+"\n"+this.certificate;
	}
}
