package PredefindMethod;

import java.util.function.Function;

public class andthenORcompose {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1=f->2*f;
		Function<Integer,Integer> f2=f->f*f*f;
		
		
		// 
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));

	}

}
