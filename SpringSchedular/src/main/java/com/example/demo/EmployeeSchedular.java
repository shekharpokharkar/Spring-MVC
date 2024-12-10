package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class EmployeeSchedular {

	/*
	 * Scheduled After 5 sec
	 */
	//@Scheduled(fixedDelay = 5000)
	@Scheduled(timeUnit = TimeUnit.SECONDS,fixedDelay = 2)
	//@Scheduled(cron = "")
	public void printEmail()
	{
		System.out.println("Hello Good Morming");
	}
}
