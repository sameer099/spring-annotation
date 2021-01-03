package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")    //bean id = thatSillyCoach
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice serves above speed of 140mph";
	}

}
