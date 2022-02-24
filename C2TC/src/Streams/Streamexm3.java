package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Employe 
{
	int eid;
	String name;
	String des;
	float salary;
	
	public Employe(int eid, String name, String des, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.des = des;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", des=" + des + ", salary=" + salary + "]";
	}
	
	

}
public class Streamexm3 {
	public static void main(String[] args) {
		
		Employe e3=new Employe(103,"Johny","Senior Manager",60000);
		Employe e4=new Employe(104,"Robert","Associate",70000);
		Employe e5=new Employe(105,"Michael","Sr Associate",40000);
		
		List<Employe> ll=new ArrayList<Employe>();
		ll.add(new Employe(101,"John","Manager",50000));
		ll.add(new Employe(102,"Smith","Lead",60000));
		ll.add(e3);
		ll.add(e4);
		ll.add(e5);
		
		Stream<Employe> pstream=ll.parallelStream();
		pstream.forEach(System.out::println);
	}
}
