package ProgsAskedInInterview;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrintDateAndTime {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("d-M-yyyy  HH:mm:ss  E  Z");
		
		//using Date class
		Date dt = new Date();
		System.out.println(df.format(dt));
		
		//using Calendar class
		Calendar cl = Calendar.getInstance();
		System.out.println(df.format(cl.getTime()));
	}
}