package com.example.demo.cache;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Status;

@Service
public class Cache {
	
	Map<Integer, Status> m = new HashMap<>();

	public void storeStatue(Status status) {
		m.put(status.getTid(), status);

	}

	public Status getCacheStatus(int trainId) {

		return m.get(trainId);
	}

	public boolean checkData(int trainId) {

		return m.containsKey(trainId);

	}

}
