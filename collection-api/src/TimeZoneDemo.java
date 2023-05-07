import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] zones = TimeZone.getAvailableIDs();
		for(String zone : zones) {
			System.out.println(zone);
		}
		System.out.println("Total IDs : " + zones.length);
		
		TimeZone z = TimeZone.getTimeZone("PST");
		
		GregorianCalendar cal = new GregorianCalendar(z);
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		
		Date Local = new Date();
		System.out.println(Local);
	}

}
