package DateAndTime;

import java.time.LocalDate;
import java.time.Period;

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
		System.out.printf("You are %d Years %d month %d days  old",p.getYears(),p.getMonths(),p.getDays());
		

	}

}
