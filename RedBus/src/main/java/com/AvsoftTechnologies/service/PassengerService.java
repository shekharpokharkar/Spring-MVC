package com.AvsoftTechnologies.service;

import com.AvsoftTechnologies.Entity.Passenger;

public interface PassengerService {

	
	public void savePassenger(Passenger passenger );
	public void deletePassenger(int passengerId);
	public Passenger getPassenger(int passengerId);
}
