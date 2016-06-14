package com.ww.dateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class ValidatingDate implements Callable {

	public static void main(String args[]) throws ParseException {
		// Date date = new Date("20150401 08:36");

		/*
		 * SimpleDateFormat formatter, FORMATTER; formatter = new
		 * SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); String oldDate =
		 * "2008-03-14T11:53:31.200+05:00"; Date date1 =
		 * formatter.parse(oldDate.substring(0, 26) + oldDate.substring(27,
		 * 29)); FORMATTER = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
		 * System.out.println("OldDate-->"+oldDate);
		 */
		// System.out.println("NewDate-->"+FORMATTER.format(date));
	}

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyyMMdd HH:mm");

		Date inputDate = inputFormat.parse("20150401 08:36");

		SimpleDateFormat outputFormat = new SimpleDateFormat(
				"yyyy-MM-dd'T'HH:mm:ss");

		String outputDate = outputFormat.format(inputDate);
		return outputDate;
	}
}
