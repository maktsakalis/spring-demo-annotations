package com.springpractice.annotations.coach;

import com.springpractice.annotations.fortuneservices.FortuneService;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Let's play some football!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
