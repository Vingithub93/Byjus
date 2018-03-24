package generics;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Generics {

	public static String dirPath=System.getProperty("user.dir");
	
	public static String TimeStamp() {
    	Date date = new Date();
	    SimpleDateFormat ft = new SimpleDateFormat ("_dd-MMM-yyyy_HH-mm-ss");
	    return ft.format(date.getTime());
	}
}
