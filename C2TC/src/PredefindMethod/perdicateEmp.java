package PredefindMethod;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}

public class perdicateEmp {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee("Talha",3000));
		l.add(new Employee("Sajid",7000));
		l.add(new Employee("Arbaz",4000));
		l.add(new Employee("Khan",2000));
		l.add(new Employee("Asim",9000));
		l.add(new Employee("Riyaz",13000));
		Predicate<Employee> p=e1->e1.salary>3000;
		for(Employee e:l) {
			if(p.test(e)) {
				System.out.println(e.name+"  "+e.salary);
			}
		}
		

	}

}
