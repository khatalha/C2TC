package PredefindMethod;

import java.util.function.Function;

public class functionexm {

	public static void main(String[] args) {
//		Function<Integer,Integer> f=n->n*n;
//		System.out.println(f.apply(5));
//		System.out.println(f.apply(4));
//		System.out.println(f.apply(2));
		
		Function<Integer,Double> f= n->Math.sqrt(n);
        System.out.println(f.apply(4));
        System.out.println(f.apply(6));
		
		Function<String,Integer> s=n->n.length();
		System.out.println(s.apply("TAlha"));
		System.out.println(s.apply("Usman khan"));
		System.out.println(s.apply("Hello World"));
		
		Function<String,String> u=n->n.toUpperCase();
		System.out.println(u.apply("TAlha"));
		System.out.println(u.apply("Usman khan"));
		System.out.println(u.apply("Hello World"));
	}
	

}
