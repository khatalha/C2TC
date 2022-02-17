package PredefindMethod;
import java.util.function.Function;
//import java.util.function.IntFunction;

public class primitiveFunction {

	public static void main(String[] args) {
		
		//IntFunction<Integer,Integer> f=n->n*n;
		//System.out.println(f.apply(4));
	}

}
/*
IntFunction :(i) can take input in integer type 
				(ii) return type can be any type
				
DoubleFunction :(i) can take input in Double type 
				(ii) return type can be any type

LongFunction :(i) can take input in Long type 
				(ii) return type can be any type
----------------------------------------------------
DoubleToIntFunction: input type Double
					 return type integer
	method: applyAsInt(double value)				 
					 
					 
DoubleToLongFunction: input type Double
					 return type long
	method: applyAsLong(double value)
	
		
IntToDoubleFunction-->applyAsDouble()
IntToLongFunction-->applyAsLong()

LongToIntFunction-->applyAsInt()
LongToLongFunction-->applyAsLong()

----------------------------------------------------

ToIntFunction-->input type can be anything
					 return type integer
	method: applyAsInt(double value)
					 


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