package com.springpractice.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springpractice.annotations.annotationconfigs.SportConfig;
import com.springpractice.annotations.coach.SwimCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getName());
		System.out.println(swimCoach.getAge());

		context.close();
	}
}
