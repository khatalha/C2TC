package PredefindMethod;

import java.util.function.Consumer;
class movie{
	String name;

	public movie(String name) {
		this.name = name;
	}
	
	
	
}
public class consumer {

	public static void main(String[] args) {
		//Consumer<String> c =s->System.out.println(s);
		
		//c.accept("TAlha usman khan");
		//c.accept("TAlha");
		//c.accept("TAlha");
		
		/*
		 * Take some input and check some conditional and its return boolean value--->predicate
		 * predicate have Test() method
		 * 
		 *  Take some input and perform some operation and return the need to boolean--->Function
		 *  Function have apply() method
		 *  
		 *  Accept some input and perform req operation to return nothing--->Consumer
		 *  Consumer have accept() method
		 */
		
		
		Consumer<movie> c1=s->System.out.println(s.name+"its is very smart");
		Consumer<movie> c2=s->System.out.println(s.name+"its is very DUll person");
		Consumer<movie> c3=s->System.out.println(s.name+"its is very so  smart and Dull");
		Consumer<movie> cc=c1.andThen(c2).andThen(c3);
		
		movie m = new movie("TAlha usman khan ");
//		c1.accept(m);
//		c2.accept(m);
//		c3.accept(m);
		
		
		cc.accept(m);// in one line print
		
		
	}

}
/*
********************8Primitive types of Consumer**********************
IntConsumer
        void accept(int value)
LongConsumer
DoubleConsumer


    ---------------------------------------------------
ObjIntConsumer
        void accept(T t,int value)
ObfLongConsumer
         void accept(T t,Long value)
ObjDoubleConsumer
         void accept(T t,Double value)
 */
