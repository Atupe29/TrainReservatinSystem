package com.train.booking;

import java.time.LocalDate;

public class Train {

	private int TrainNumber;
	private String TrainName;
	private String fromstation;
	private String tostation;
	private int Seatavailable;
	private int fare;
	private LocalDate lcd;
	public int getTrainNumber() {
		return TrainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		TrainNumber = trainNumber;
	}
	public String getTrainName() {
		return TrainName;
	}
	public void setTrainName(String trainName) {
		TrainName = trainName;
	}
	public String getFromstation() {
		return fromstation;
	}
	public void setFromstation(String fromstation) {
		this.fromstation = fromstation;
	}
	public String getTostation() {
		return tostation;
	}
	public void setTostation(String tostation) {
		this.tostation = tostation;
	}
	public int getSeatavailable() {
		return Seatavailable;
	}
	public void setSeatavailable(int seatavailable) {
		Seatavailable = seatavailable;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public LocalDate getLcd() {
		return lcd;
	}
	public void setLcd(LocalDate lcd) {
		this.lcd = lcd;
	}
	public Train(int trainNumber, String trainName, String fromstation, String tostation, int seatavailable, int fare,
			LocalDate lcd) {
		super();
		TrainNumber = trainNumber;
		TrainName = trainName;
		this.fromstation = fromstation;
		this.tostation = tostation;
		Seatavailable = seatavailable;
		this.fare = fare;
		this.lcd = lcd;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Train [TrainNumber=" + TrainNumber + ", TrainName=" + TrainName + ", fromstation=" + fromstation
				+ ", tostation=" + tostation + ", Seatavailable=" + Seatavailable + ", fare=" + fare + ", lcd=" + lcd
				+ "]";
	}
	
	
	
}
