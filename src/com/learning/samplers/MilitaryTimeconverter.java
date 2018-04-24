/**
 * 
 */
package com.learning.samplers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/**
 * @author Mayank
 *
 */
public class MilitaryTimeconverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String date = "12:05:45AM";

		String convertedDate = null;


		DateFormat df = new SimpleDateFormat("hh:mm:ssa");
		Date result = null;
		SimpleDateFormat sdf = null;
		try {
			result = df.parse(date);
			sdf = new SimpleDateFormat("HH:mm:ss");
			
			convertedDate = sdf.format(result); //prints date in the format sdf
		} catch(ParseException parseException)  {
			//
		}

		System.out.println(convertedDate);


	}

}
