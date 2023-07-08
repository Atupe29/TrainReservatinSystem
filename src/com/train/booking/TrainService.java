package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {

	private static List<Train> alltTrains = new LinkedList<>();

	static {
		alltTrains.add(new Train(100, "SuperEx", "mumbai", "pune", 50, 100, LocalDate.now()));
		alltTrains.add(new Train(101, "SuperEx1", "mumbai", "nashik", 30, 150, LocalDate.now()));
		alltTrains.add(new Train(102, "SuperEx2", "mumbai", "jalgav", 60, 200, LocalDate.now()));
		alltTrains.add(new Train(103, "Bullet", "mumbai", "Shambajinagar", 50, 100, LocalDate.now()));
		alltTrains.add(new Train(104, "SuperEx4", "mumbai", "nagapur", 40, 300, LocalDate.now()));
		alltTrains.add(new Train(105, "SuperEx5", "mumbai", "Akola", 80, 10, LocalDate.now()));

	}

	public static Train findTrain(int TrainNUmber) {

		Train temp = null;
		for (Train i : alltTrains) {
			if (i.getTrainNumber() == TrainNUmber  ) {
				temp = i;
				break;
			}
		}
		System.out.println("Train Details: " + temp);
		return temp;

	}

	public static Train findTrain(String fromstation, String tostation) {

		Train temp = null;

		for (Train i : alltTrains) {
			if (i.getFromstation() == fromstation && i.getTostation() == tostation) {
				temp = i;
				break;
			}
		}
		System.out.println("Train Details:" + temp);
		return temp;
	}

	public static Train fineTrain(String TrainName) {

		Train temp = null;
		for (Train i : alltTrains) {
			if (i.getTrainName() == TrainName) {
				temp = i;
				break;
			}
		}
		System.out.println("Train Details :" + temp);
		return temp;

	}

//	public static Train findTrain(int Seatavailable) {

		//Train temp = null;
		//for (Train i : alltTrains) {
			//if (i.getSeatavailable() == Seatavailable) {
				//temp = i;
				//break;

		//	}
		//}
		//System.out.println("Train details :"+ temp);
		//return temp;
	}

