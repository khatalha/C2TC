package PredefindMethod;

import java.util.function.BiPredicate;

public class bipredicateex1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bi = (a,b)->(a+b)%2==0;
		System.out.println(bi.test(3, 3));
		System.out.println(bi.test(34, 3));
	}

}
