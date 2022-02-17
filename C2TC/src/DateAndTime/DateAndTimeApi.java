package DateAndTime;

import java.time.LocalDateTime;

public class DateAndTimeApi {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);//print current Date Time

			
		LocalDateTime costom = LocalDateTime.of(2000,5,13,2,45);
		System.out.println(costom);
		
		System.out.println("After 6 month "+costom.plusMonths(6));
		System.out.println("Befor6 montn "+costom.minusMonths(6));

	}

}
