package com.example.demo.Utility;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.example.demo.Entity.Status;

@Component
public class CacheUtility {
	
	
	public HashMap<Integer,Status>storeStatus=new HashMap<>();
	
	
	public void addStatus(Status status)
	{
		storeStatus.put(status.getTid(), status);
	}
	
	public Status getStatusData(int tid)
	{
		Status status=null;
		boolean containsKey = storeStatus.containsKey(tid);
		if(containsKey == true)
		{
			status = storeStatus.get(tid);
			
		}
		return status;
	}
	
	public boolean isStatusAvailable(int trainId) {

		return storeStatus.containsKey(trainId);
	}
	
	public void clearCache() {
		System.out.println("clearing cache");
		storeStatus.clear();

	}

}
