package p0625;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class C0625_06 {

	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();	
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
	}
}
