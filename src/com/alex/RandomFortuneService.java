package com.alex;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] randFortunes = {"Bad luck today", "Work hard today", "Sleep a lot today"};
	
	Random rand = new Random();
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return randFortunes[rand.nextInt(randFortunes.length)];
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
