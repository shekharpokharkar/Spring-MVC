package com.AvsoftTechnologies.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AvsoftTechnologies.Entity.Passenger;
import com.AvsoftTechnologies.Repository.PassengerDAO;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private PassengerDAO PassengerDAO;

	@Override
	public void savePassenger(Passenger passenger) {
		PassengerDAO.save(passenger);
		
	}

	@Override
	public void deletePassenger(int passengerId) {
		PassengerDAO.deleteById(passengerId);
		
	}

	@Override
	public Passenger getPassenger(int passengerId) {
		Optional<Passenger> byId = PassengerDAO.findById(passengerId);
		if(byId.isPresent())
		{
			return byId.get();
		}
		return null;
	}

}
