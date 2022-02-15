package collectionframework;

import java.util.Enumeration;
import java.util.Vector;

class Student2
{
    int id;
    String name;
    int grade;

    public Student2(int id, String name, int grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public String toString()
    {
        String str="Student is ["+id+","+name+","+grade+"]";
        return str;
    }
}
class Employee2
{
    int id;
    String name;
    String email;
    Float salary;

    public Employee2(int id, String name, String email, Float salary) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }
    public String toString()
    {
        String str="("+id+","+name+","+email+","+salary+")";
        return str;
    }
}

public class vectordemo {

	public static void main(String[] args) {
		 Vector v = new Vector<>();
	        Student2 s1=new Student2(101,"Harry",10);
	        Student2 s2=new Student2(102,"Potter",10);

	        v.add(s1);
	        v.add(s2);
	        v.add("3e3");
	        v.add("3e3");
	        v.add("3e3");
	        v.add("3e3");

	        Enumeration e = v.elements();
	        while (e.hasMoreElements()){
	            Object o = e.nextElement();
	            System.out.println(o);
	        }
	}

}
