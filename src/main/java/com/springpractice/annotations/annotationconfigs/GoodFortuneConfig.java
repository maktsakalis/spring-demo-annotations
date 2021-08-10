package com.springpractice.annotations.annotationconfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springpractice.annotations.coach.Coach;
import com.springpractice.annotations.coach.FootballCoach;
import com.springpractice.annotations.fortuneservices.FortuneService;
import com.springpractice.annotations.fortuneservices.GoodFortuneService;

@Configuration
public class GoodFortuneConfig {

	@Bean
	public FortuneService goodFortuneService() {
		return new GoodFortuneService();
	}
	
	@Bean
	public Coach footBallCoach() {
		return new FootballCoach(goodFortuneService());
	}
	
}
