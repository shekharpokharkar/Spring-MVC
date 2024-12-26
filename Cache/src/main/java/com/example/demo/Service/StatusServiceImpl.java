package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Status;
import com.example.demo.Repository.StatusRepository;
import com.example.demo.Utility.CacheUtility;

@Service
public class StatusServiceImpl implements StatusService {
	
	@Autowired
	private StatusRepository repository;
	
	@Autowired
	private CacheUtility cache;

	@Override
	public Status getTrainStatus(int trainId) {
		
		Status statusData=null;
		System.out.println(cache.isStatusAvailable(trainId));
		if(cache.isStatusAvailable(trainId))
		{
			System.out.println("getting data from cache");
			statusData = cache.getStatusData(trainId);
		}
		else
		{
			System.out.println("get Data from db");
			Optional<Status> byId = repository.findById(trainId);
			statusData=byId.get();
			cache.addStatus(statusData);
		}
	
		return statusData;
	}

	@Override
	public boolean addTrainStatus(Status status) {
		
		Status save = repository.save(status);
		if(save == null)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
	}

	

}
