package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateApi1 {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.parse("2017-03-01").getDayOfWeek();
		 System.out.println(dayOfWeek);
		 int dayOfMonth = LocalDate.parse("2017-03-01").getDayOfMonth();
		 System.out.println(dayOfMonth);
		 System.out.println();
		 
		 LocalDate thisYear = LocalDate.now();
		 System.out.println(thisYear.isLeapYear());
		 
		 LocalDate previousYear = LocalDate.now().minusYears(1);
		 System.out.println(previousYear.isLeapYear());
		 
		 boolean before = LocalDate.parse("2017-03-01").isBefore(LocalDate.parse("2017-02-28"));
		 System.out.println(before);
		 
		 boolean after = LocalDate.parse("2017-03-01").isAfter(LocalDate.parse("2017-02-28"));
		 System.out.println(after);
		 System.out.println("---------------");
		 
		 LocalDateTime atStartOfDay = LocalDate.parse("2017-03-01").atStartOfDay();
		 System.out.println(atStartOfDay);
		 
		 LocalDate with = LocalDate.parse("2017-03-11").with(TemporalAdjusters.firstDayOfMonth());
		 System.out.println(with);
	}

}
