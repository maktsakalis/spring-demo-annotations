package com.springpractice.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springpractice.annotations.annotationconfigs.GoodFortuneConfig;
import com.springpractice.annotations.coach.FootballCoach;

public class MyJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GoodFortuneConfig.class);

		FootballCoach footBallCoach = context.getBean("footBallCoach", FootballCoach.class);
		System.out.println(footBallCoach.getDailyWorkout());
		System.out.println(footBallCoach.getDailyFortune());

		context.close();
	}

}
