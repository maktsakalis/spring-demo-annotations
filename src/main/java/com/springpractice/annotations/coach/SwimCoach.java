package com.springpractice.annotations.coach;

import org.springframework.beans.factory.annotation.Value;

import com.springpractice.annotations.fortuneservices.FortuneService;

public class SwimCoach implements Coach {

	@Value("${foo.name}")
	private String name;

	@Value("${foo.age}")
	private int age;

	private FortuneService sadFortuneService;

	public SwimCoach(FortuneService sadFortuneService) {
		super();
		this.sadFortuneService = sadFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim like there is no tomorrow!";
	}

	@Override
	public String getDailyFortune() {
		return sadFortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
