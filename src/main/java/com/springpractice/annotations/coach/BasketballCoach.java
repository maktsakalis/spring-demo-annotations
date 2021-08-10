package com.springpractice.annotations.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.springpractice.annotations.fortuneservices.FortuneService;

@Component
public class BasketballCoach implements Coach {

	private FortuneService fortuneService;

	// constructor injection -- note that @Qualifier is placed in constructor arguments and not in field declaration of fortuneService
	@Autowired
	public BasketballCoach(@Qualifier("myRandomFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
		System.out.println("Inside BasketballCoach constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "BasketballCoach: Practice pick-n-roll!";
	}

	public String getDailyFortune() {
		return "BasketballCoach: " + fortuneService.getFortune();
	}

}
