/**
 * 
 */
package com.learning.samplers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Mayank
 *
 */
public class DisplayDay {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		String date = "08-05-2015";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");

		Date date1 = sdf.parse(date);

		DateFormat format2=new SimpleDateFormat("EEEE"); 
		String dayOfWeek = format2.format(date1);
		
		System.out.println(dayOfWeek);
	}

}
