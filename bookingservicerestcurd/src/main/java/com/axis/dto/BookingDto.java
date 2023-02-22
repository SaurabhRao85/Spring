package com.axis.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingDto {

	
	private int id;
	private int price;
	private LocalDate bookedDate;
	private String trainName;
	private String source;
	private String destination;
	private LocalDateTime journeyDate;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(LocalDate bookedDate) {
		this.bookedDate = bookedDate;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDateTime getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDateTime journeyDate) {
		this.journeyDate = journeyDate;
	}
	
	
	
}