package org.bank.customer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class DateDemo {
	
	
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try{
			String demoDate="01/01/1996";
			Date d=null;
			d=formatter.parse(demoDate);
			System.out.println(d);
		}
		catch (ParseException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			}
	}
}


/* SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

java.util.Date dob = null;
String date=request.get("dob");
try {
  dob = formatter.parse(date);
} catch (ParseException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}
*/