package com.alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

	public static void main(String[] args) {
		
		// Load spring config fils
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from the spring container
		RandomCoach theCoach = context.getBean("myRandomCoach", RandomCoach.class);
		
		RandomCoach alphaCoach = context.getBean("myRandomCoach", RandomCoach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		// check if they are the same (singleton)
		boolean result = (theCoach == alphaCoach);
		
		// print the results
		System.out.println("\nPointing to the same object " + result);
		
		System.out.println("\nMemory address for: " + theCoach);
		System.out.println("\nMemory address for: " + alphaCoach);
		
		context.close();
		

	}

}
