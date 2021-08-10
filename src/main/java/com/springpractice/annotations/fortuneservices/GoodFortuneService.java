package com.springpractice.annotations.fortuneservices;

import org.springframework.stereotype.Component;

@Component("Makis")
public class GoodFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a good fortune!";
	}

}
