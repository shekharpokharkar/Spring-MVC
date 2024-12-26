package com.example.demo.Service;

import com.example.demo.Entity.Status;

public interface StatusService {
	
	public Status getTrainStatus(int trainId);
	public boolean addTrainStatus(Status status);
	

}
