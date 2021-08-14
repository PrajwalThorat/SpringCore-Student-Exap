package org.stackroute.component.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("compo.xml");
		Student stud =(Student)context.getBean("student");
		stud.StudentInfo();	
	}
}
