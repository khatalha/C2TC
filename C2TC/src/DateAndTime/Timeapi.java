package DateAndTime;

import java.time.LocalTime;

public class Timeapi {

	public static void main(String[] args) {
		
		LocalTime time= LocalTime.now();
		System.out.println(time);//print current Time
		
		int hr=time.getHour();
		System.out.println(hr);//print current hour
		
		int min=time.getMinute();
		System.out.println(min);//print current minute
		
		int sec=time.getSecond();
		System.out.println(sec);//print current second
		
		int nano=time.getNano();
		System.out.println(nano);//print current nano second
		
		System.out.printf("%d-%d-%d-%d",hr,min,sec,nano);//custom m format
	}

}
