package org.stackroute.standlone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standCollection.xml");
		Person person=(Person)context.getBean("person");
		System.out.println(person);
		System.out.println(person.getFrinds().getClass().getName());
		System.out.println(person.getFeeStructure());

	}

}
