package com.alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// Retrieve bean from the Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// Run the methods on our bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		
		// check if they are the same (singleton)
		boolean result = (theCoach == alphaCoach);
		
		// print the results
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\nMemory address for: " + theCoach);
		System.out.println("\nMemory address for: " + alphaCoach);

		// Close the context
		context.close();
	}

}
