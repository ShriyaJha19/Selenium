package coreJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTheSystemDate {
	public static void main(String[] args) {
		//classname referenceName = new classname();
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toGMTString());
		//ddMMyyyy
		DateFormat df = new SimpleDateFormat("yyyy_MMM_dd");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
	}

}
