package com.alex;

public class RandomCoach implements Coach {
	private RandomFortuneService randomFortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice random things my dude!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return randomFortuneService.getFortune();
	}
	
	// Setter method for random
	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}
}
