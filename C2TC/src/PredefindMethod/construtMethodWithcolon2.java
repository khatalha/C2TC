package PredefindMethod;

class Stud{
	String name;
	int age;
	int marks;
	int rollno;
	public Stud(String name, int age, int marks, int rollno) {
		
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.rollno = rollno;
	}
	
	
}

interface School{
	public Stud get(String name, int age, int marks, int rollno);
}
public class construtMethodWithcolon2 {

	public static void main(String[] args) {
		
		School s=(name,age,marks,roiino)->new Stud(name,age,marks,roiino);
		School p=Stud::new;
		
		Stud m1=p.get("Talha", 20, 78, 15);
		Stud m2=p.get("Sajid", 22, 48, 16);
		Stud m3=p.get("Ali", 10, 68, 17);
		Stud m4=p.get("Asif", 22, 88, 18);
		
		

	}

}
