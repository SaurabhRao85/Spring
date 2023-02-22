package com.axis.dto;

public class TrainDto {

	private int id;
	private String trainName;
	private int noOfStops;
	private int totalHoursOfJourney;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public int getNoOfStops() {
		return noOfStops;
	}
	public void setNoOfStops(int noOfStops) {
		this.noOfStops = noOfStops;
	}
	public int getTotalHoursOfJourney() {
		return totalHoursOfJourney;
	}
	public void setTotalHoursOfJourney(int totalHoursOfJourney) {
		this.totalHoursOfJourney = totalHoursOfJourney;
	}
	
	
}
