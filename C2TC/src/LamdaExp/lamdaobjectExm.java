package LamdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    String name;
    int eno;

    public Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return name + ":" + eno;
    }
}

public class lamdaobjectExm {

	public static void main(String[] args) {
		 ArrayList<Employee> l = new ArrayList<Employee>();
	        l.add(new Employee("Talha",772234));
	        l.add(new Employee("Sajid",552234));
	        l.add(new Employee("Asif",332234));
	        l.add(new Employee("Ali",112234));
	        l.add(new Employee("Aftab",222234));

	        System.out.println(l);


	        //sort with employee number
	        //Comparator<Employee> c = (e1,e2)->(e1.eno< e2.eno)?-1:(e1.eno>e2.eno)?1:0;

	       //sort with employee name
	        //compare for string (compareTo)
	        Comparator<Employee> c = (e1,e2)->e1.name.compareTo(e2.name);

	        Collections.sort(l,c);

	        System.out.println(l);

	}

}
