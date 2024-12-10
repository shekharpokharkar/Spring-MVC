package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Status;

@Repository
public interface StatusRepo extends JpaRepository<Status, Integer> {

	
}
