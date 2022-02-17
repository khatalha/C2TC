package PredefindMethod;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	
}

public class functionexmwithobject {

	public static void main(String[] args) {
		
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A";
			else if(marks>=80) grade="B";
			else if(marks>=60) grade="C";
			else if(marks>=50) grade="D";
			else if(marks>=35) grade="E";
			else grade="FAILED"; 
			return grade;
			
		};

		Predicate<Student> p=s->s.marks>50;
		Consumer<Student> c =s1->{
			System.out.println("Student Name: "+s1.name);
			System.out.println("Student Marks: "+s1.marks);
			System.out.println("Student Name: "+f.apply(s1)); 
			System.out.println();
			};
		
		
		
		Student[] s= {
				new Student("Talha",55),
				new Student("Sahid",80),
				new Student("Ali",65),
				new Student("Sajid",35),
				new Student("Usman",48),
		};
		
		/*
		 * for(Student s1: s) {
		 * 
		 * if(p.test(s1)) {
		 * 
		 * 
		 * System.out.println("Student Name: "+s1.name);
		 * System.out.println("Student Marks: "+s1.marks);
		 * System.out.println("Student Name: "+f.apply(s1)); System.out.println();
		 * 
		 * }
		 * 
		 * }
		 */
		
		for(Student s1: s) {
			
			if(p.test(s1)) {
				c.accept(s1);
			}
			
		}
		
	}

}
