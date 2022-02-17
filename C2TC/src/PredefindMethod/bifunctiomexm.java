package PredefindMethod;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Students{
	int sno;
	String name;
	public Students(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	
	
}

public class bifunctiomexm {

	public static void main(String[] args) {
		
		ArrayList<Students> l= new ArrayList<Students>();
		BiFunction<Integer,String,Students> b=(sno,name)->new Students(sno,name);
		
		l.add(b.apply(100, "Talha"));
		l.add(b.apply(101, "Sajid"));
		l.add(b.apply(102, "Asif"));
		l.add(b.apply(104, "Ali"));
		l.add(b.apply(105, "Aftab"));
		
		for(Students s:l) {
			System.out.println("Stusent name"+s.name);
			System.out.println("Student number"+s.sno);
			System.out.println();
		}
	}

}
