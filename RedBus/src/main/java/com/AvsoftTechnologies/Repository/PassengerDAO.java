package com.AvsoftTechnologies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AvsoftTechnologies.Entity.Passenger;

public interface PassengerDAO extends JpaRepository<Passenger, Integer>{

}
