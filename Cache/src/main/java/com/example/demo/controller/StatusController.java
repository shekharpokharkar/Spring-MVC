package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Status;
import com.example.demo.Service.StatusService;

@RestController
public class StatusController {

	@Autowired
	private StatusService service;

	@GetMapping("/trainStatus/{trainId}")
	public ResponseEntity<Status> getTrainStatus(@PathVariable("trainId") int id) {

		Status trainStatus = service.getTrainStatus(id);
		return new ResponseEntity<Status>(trainStatus, HttpStatus.OK);
	}

	@PostMapping("/trainStatus")
	public ResponseEntity<String> addTrainStatus(@RequestBody Status status) {
		System.out.println(status);

		boolean trainStatus = service.addTrainStatus(status);

		if (trainStatus == true) {
			return new ResponseEntity<String>("Train Status added Successfully", HttpStatus.OK);
		} else {

			return new ResponseEntity<String>("Train Status Not Available", HttpStatus.OK);

		}
	}

}