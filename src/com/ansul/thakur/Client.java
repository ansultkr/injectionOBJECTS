package com.ansul.thakur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student s =context.getBean("stud", Student.class);
		s.cheating();
		
		AnotherStudent as =context.getBean("anotherstud",AnotherStudent.class);
		as.startCheating();
	}
}
