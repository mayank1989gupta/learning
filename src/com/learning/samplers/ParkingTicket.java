/**
 * 
 */
package com.learning.samplers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Mayank
 *
 */
public class ParkingTicket {

	private static final int START_PRICE = 2;
	private static final int FIRST_HOUR_PRICE = 3;
	private static final int SUCCESSIVE_HOURS_PRICE = 4;
	
	public static void main(String args[]) {
		
		String startTime = "11:30";
		String endTime = "12:31";
		
		
		System.out.println("Result: " + fetchAmount(startTime, endTime));
	}
	
	/**
	 * API to convert the date and get the API
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	private static int fetchAmount(String start, String end) {
		int amount = 0;
		int hourDifference = 0;
		SimpleDateFormat format = new SimpleDateFormat("HH:mm", Locale.getDefault());
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = format.parse(start);
			endDate = format.parse(end);
			
			long startTime = startDate.getTime();
			long endTime = endDate.getTime();
			//Invoking the API to fetch the hour difference.
			hourDifference = fetchHourDifference(startTime, endTime);
			System.out.println("Hour Diff: " + hourDifference);
			if(hourDifference > 0) {
				amount = calculateAmount(hourDifference);
			}
		} catch (ParseException exception) {
			//Handle Exception - Printing an syso for now.
			System.out.println("Error occurred while parsing date: " + exception);
		}
		
		return amount;
	}


	/**
	 * To fetch the hours difference between the given times.</br>
	 * 
	 * @param time
	 * @return
	 */
	private static int fetchHourDifference(long startTime, long endTime) {
		double result = 0;

		long displayTime = startTime - endTime;

		double sec = Math.floor(displayTime / 1000);
		double min = Math.floor(sec / 60);
		double hr = Math.abs(Math.floor(min / 60));

		result = Math.ceil(hr);
		return (int)result;//result
	}
	
	/**
	 * API to calculate the final amount.</br>
	 * 
	 * @param hourDifference
	 * @return
	 */
	private static int calculateAmount(int hourDifference) {
		int amount = START_PRICE + FIRST_HOUR_PRICE + ((hourDifference - 1) * SUCCESSIVE_HOURS_PRICE);
		
		return amount;
	}
}
