package com.alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve beans from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Do stuff
		System.out.println(theCoach.getDailyWorkout());
		
		// Close context
		context.close();

	}

}
