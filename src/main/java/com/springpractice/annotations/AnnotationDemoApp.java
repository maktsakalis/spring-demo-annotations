package com.springpractice.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpractice.annotations.coach.Coach;
import com.springpractice.annotations.coach.TennisCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// BasketballCoach uses constructor injection
		Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
		System.out.println(basketballCoach.getDailyWorkout());
		System.out.println(basketballCoach.getDailyFortune());

		// TennisCoach uses setter injection
		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getName());
		System.out.println(tennisCoach.getAge());

		context.close();
	}
}
