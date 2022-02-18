package DateAndTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class dateapi {

	public static void main(String[] args) {
		
		LocalDate date= LocalDate.now();//print current date
		System.out.println(date);
		
		int dd= date.getDayOfMonth();
		//System.out.println(dd);//print current day
		
		int mm= date.getMonthValue();
		//System.out.println(mm);//print current Month
		
		int yy= date.getYear();
	    //System.out.println(yy);//print current year
	    
	    //System.out.println(dd+":"+mm+":"+yy);//custom format
	    
	    //System.out.printf("%d/%d/%d",yy,mm,dd);//custom format
		
		LocalDate bdate= LocalDate.of(2002, 07, 13);
		Period p= Period.between(date, bdate);
		//System.out.printf("You are %d Years %d month %d days  old",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate localDate1 = LocalDate.now();
		//System.out.println(localDate1);
		
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate2 = LocalDate.now(clock);
		//System.out.println(localDate2);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		LocalDate localDate3 = LocalDate.now(zoneId);
		//System.out.println(localDate3);
		
		System.out.println("--------------------------");
		LocalDate localDate4 = LocalDate.of(2017, 03, 02);
		//System.out.println(localDate4);
		
		LocalDate localDate5 = LocalDate.parse("2017-03-05");
		
		System.out.println(localDate5);
		
		LocalDate localDate6 = localDate5.plusDays(2);
		//System.out.println(localDate6);
		
		LocalDate minus = localDate5.minus(2, ChronoUnit.DAYS);
		//System.out.println(minus);
	}

}
