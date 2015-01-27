package com.ekaplus.collections;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAndDate {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat();

		Date cDate = null;
		Time cTime = null;

		// date formate 2014-11-01
		// cDate = rs.getDate(8);
		// Time formate in 00:00:20
		// cTime = rs.getTime(10);
		System.out.println("date:" + cDate);
		System.out.println("time:" + cTime);

		// cDate=new TimeAndDate();
		String dbDateStr = "2014-11-01 00:00:20";
		Date dateToForate = new SimpleDateFormat("yyy-M-dd hh:mm:ss")
				.parse(dbDateStr);

		

		// System.out.println("DateAndTime"+dateTime);//144........like
		// something
		System.out.println("DateAndTimeFormate: "
				+ new SimpleDateFormat("yyy-MM-dd HH:mm:ss")
						.format(dateToForate));
		
		
		String inputTimeStamp = "08/16/2011";
		final String inputFormat = "MM/dd/yyyy";
		final String outputFormat = "EEE MMM dd HH:mm:ss z yyyy";
		System.out.println(TimeStampConverter(inputFormat, inputTimeStamp,
				outputFormat));
		/*
		 * int date = cDate.getDate(); long time = cTime.getTime(); long
		 * dateTime = date+time;
		 * 
		 * 
		 * System.out.println("DateAndTime"+dateTime);//144........like
		 * something
		 */System.out.println("DateAndTimeFormate: "
				+ new SimpleDateFormat("yyy-MM-dd HH:mm:ss")
						.format(dateToForate));

		System.out.println(new SimpleDateFormat("M/dd/yyyy")
				.parse("08/16/2011"));

	}

	private static String TimeStampConverter(final String inputFormat,
			String inputTimeStamp, final String outputFormat)
			throws ParseException {
		return new SimpleDateFormat(outputFormat).format(new SimpleDateFormat(
				inputFormat).parse(inputTimeStamp));
	}

}
