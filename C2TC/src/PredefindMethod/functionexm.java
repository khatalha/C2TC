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

/*
********************8Primitive types of Function**********************
*
*
*
IntFunction :(i) can take input in integer type
				(ii) return type can be any type

	(I)	IntFunction<Integer> f= n->n*n;
        System.out.println(f.apply(4));
        System.out.println(f.apply(31));


  (II)  Function<String,Integer> f= n->n.length();
        System.out.println(f.apply("Talha Usman"));
        System.out.println(f.apply("Sajid"));

DoubleFunction :(i) can take input in Double type
				(ii) return type can be any type

    (I)     DoubleFunction<Double> f= n->n*n;
            System.out.println(f.apply(4.2));
            System.out.println(f.apply(12));
LongFunction :(i) can take input in Long type
				(ii) return type can be any type
                    *
    (I)     LongFunction<Long> f= n->n*n;
            System.out.println(f.apply(41111111));
            System.out.println(f.apply(31));
    ----------------------------------------------------
DoubleToIntFunction: input type Double
					 return type integer
	method: applyAsInt(double value)


DoubleToLongFunction: input type Double
					 return type long
	method: applyAsLong(double value)


IntToDoubleFunction-->applyAsDouble()

 (I)    IntToDoubleFunction f= n->Math.sqrt(n);
        System.out.println(f.applyAsDouble(9));
        System.out.println(f.applyAsDouble(6));



IntToLongFunction-->applyAsLong()

LongToIntFunction-->applyAsInt()
LongToLongFunction-->applyAsLong()

----------------------------------------------------

ToIntFunction-->input type can be anything
					 return type integer
	method: applyAsInt()


	(I) ToIntFunction<String> f= n->n.length();
        System.out.println(f.applyAsInt("Talha Usman"));
        System.out.println(f.applyAsInt("Sajidkhan"));



ToLongFunction-->input type can be anything
					 return type Long
	method: applyAsLong(double value)

same as

ToDoubleFunction

----------------------------------------------------
				TWO PERAMETERS

ToIntBiFunction-->input type can be anything
					 return type integer
			method: applyAsInt(T t,U u)
ToLongBiFunction
			method: applyAsLong(T t,U u)
ToDoubleBiFunction
			method: applyAsDouble(T t,U u)


----------------------------------------------------



*/

