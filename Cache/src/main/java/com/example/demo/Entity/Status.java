package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TrainStatus")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Train_Id")
	private Integer tid;
	@Column(name = "Train_Name")
	private String trainName;
	@Column(name = "Train_Total_Seats")
	private Integer trainTotalSeats;
	@Column(name = "Train_Available_Seats")
	private Integer trainAvailableSeats;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Integer getTrainTotalSeats() {
		return trainTotalSeats;
	}

	public void setTrainTotalSeats(Integer trainTotalSeats) {
		this.trainTotalSeats = trainTotalSeats;
	}

	public Integer getTrainAvailableSeats() {
		return trainAvailableSeats;
	}

	public void setTrainAvailableSeats(Integer trainAvailableSeats) {
		this.trainAvailableSeats = trainAvailableSeats;
	}

	public Status(Integer tid, String trainName, Integer trainTotalSeats, Integer trainAvailableSeats) {

		this.tid = tid;
		this.trainName = trainName;
		this.trainTotalSeats = trainTotalSeats;
		this.trainAvailableSeats = trainAvailableSeats;
	}

	public Status() {
		
	}

	@Override
	public String toString() {
		return "Status [tid=" + tid + ", trainName=" + trainName + ", trainTotalSeats=" + trainTotalSeats
				+ ", trainAvailableSeats=" + trainAvailableSeats + "]";
	}

}
