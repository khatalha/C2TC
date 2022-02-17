package PredefindMethod;

import java.util.function.Predicate;
//Predicate is use to conditional statement and its give boolean true or false
//Predicate contain only test() method
public class predicateExp2 {

	public static void main(String[] args) {
		
		int[] a = {0,5,10,15,20,25,30,35,40};
		Predicate<Integer> p1=p->p%2==0;
		Predicate<Integer> p2=p->p>10;
		
//		for(int i:a) {
//			if(p1.and(p2).test(i)) {
//				System.out.println(i);
//			}
//			
//		}
//		for(int i:a) {
//			if(p1.or(p2).test(i)) {
//				System.out.println(i);
//			}
//		}
		
//		for(int i:a) {
//			if(p1.test(i)) {
//				System.out.println(i);
//			}
		for(int i:a) {
			if(p1.negate().test(i)) {
				System.out.println(i);
			}	
		}
	}

}
