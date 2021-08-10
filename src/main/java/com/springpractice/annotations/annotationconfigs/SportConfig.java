package com.springpractice.annotations.annotationconfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springpractice.annotations.coach.Coach;
import com.springpractice.annotations.coach.SwimCoach;
import com.springpractice.annotations.fortuneservices.FortuneService;
import com.springpractice.annotations.fortuneservices.SadFortuneService;

@Configuration
//@ComponentScan("com.springpractice.annotations")
@PropertySource("classpath:myProperties.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
