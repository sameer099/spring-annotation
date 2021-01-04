package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")    //bean id = thatSillyCoach
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService=theFortuneService;
//	}
	
	
	//default constructor
	public TennisCoach() {
		System.out.println(">>>TennisCoach: inside the default constructor");
	}
	
	
	//define setter function
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>>TennisCoach: inside the setFortuneService()");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice serves above speed of 140mph";
	}

	


	@Override
	public String getDailyFortune() {
		
		
		return fortuneService.getFortune();
	}

}
