package com;

class student{
    int id;
    String name;
    String course;
    String email;
    
    
    
    
    

    public student() {
		super();
	}




	public student(int id, String name, String course, String email) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.email = email;
	}




	public void display(){
        System.out.println("student information ");
        System.out.println(id+"  "+name+"  "+course+"  "+email);
    }
}
public class contructor {

	public static void main(String[] args) {
		student s1 = new student();
        s1.email="khan@gmail.com";
        s1.course="bsc cs";
        s1.id=233;
        s1.name="talha";
        s1.display();
        
        
        student s2 = new student(12,"usman","bsc cs","talhalhamn2");
        s2.display();
       

	}

}
