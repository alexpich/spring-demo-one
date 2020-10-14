package com.alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {

	public static void main(String[] args) {
		
		// Load spring config fils
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from the spring container
		RandomCoach theCoach = context.getBean("myRandomCoach", RandomCoach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
		

	}

}
