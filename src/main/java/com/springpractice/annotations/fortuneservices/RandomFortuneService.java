package com.springpractice.annotations.fortuneservices;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] randomMessagesArray = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(randomMessagesArray.length);
		return randomMessagesArray[index];
	}
}
