package com.springpractice.annotations.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springpractice.annotations.fortuneservices.FortuneService;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	@Value("${foo.name}")
	private String name;

	@Value("${foo.age}")
	private int age;

	// add an init method
	@PostConstruct
	public void init() {
		System.out.println("TennisCoach: On init!");
	}

	// add an destroy method
	@PreDestroy
	public void destroy() {
		System.out.println("TennisCoach: On destroy!");
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "TennisCoach: " + fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

}
