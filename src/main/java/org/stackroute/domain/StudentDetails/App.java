package org.stackroute.domain.StudentDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	application context
       ApplicationContext context = new ClassPathXmlApplicationContext("myBean.xml");
       
       Student stud =(Student) context.getBean("student1");
       Student stud2 = (Student) context.getBean("student2");
       System.out.println(stud);
       System.out.print(stud2);
    }
}
