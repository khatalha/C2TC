package PredefindMethod;

import java.util.function.Predicate;

public class predicate {

	public static void main(String[] args) {
		String[] arr= {"his","article","is" ,"about" ,"the" ,"online" ,"encyclopedia"};
		Predicate<String> p1 =n1->n1.length()%2==0;
		for(String s1:arr) {
			if(p1.test(s1)) {
				System.out.println(s1);
			}
		}


	}

}
