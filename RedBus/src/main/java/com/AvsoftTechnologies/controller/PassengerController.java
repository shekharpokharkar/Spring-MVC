package com.AvsoftTechnologies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AvsoftTechnologies.Entity.Passenger;
import com.AvsoftTechnologies.service.PassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerService service;
	
	@PostMapping("/passenger")
	public String savePassenger(@RequestBody Passenger passenger)
	{
		service.savePassenger(passenger);
		return "Passenger Saved Successfully";
	}
	
	@GetMapping("/passenger/{pid}")
	public Passenger getPassengerById(@PathVariable("pid")int id)
	{
		Passenger passenger=service.getPassenger(id);
		return passenger;
		
	}
	
	@DeleteMapping("/passenger/{pid}")
	public String deletePassenger(@PathVariable("pid")int id)
	{
		service.deletePassenger(id);
		return "Passenger deleted Successfully";
	}

}
