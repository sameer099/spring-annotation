package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFotuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "today is your lucky day";
		
	}

}
