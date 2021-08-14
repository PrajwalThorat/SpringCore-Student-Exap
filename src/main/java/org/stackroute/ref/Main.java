package org.stackroute.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("refrance.xml");
		
		School temp=(School)context.getBean("school");
		Student temp1 = (Student)context.getBean("stud");
		
		System.out.println(temp);  
		System.out.println(temp1);
	}
}
