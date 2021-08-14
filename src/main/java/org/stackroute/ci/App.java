package org.stackroute.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("contructor.xml");
		
		Person person1 =(Person)context.getBean("person");
		System.out.println(person1);
	}
}
