package Generics;

public class genericsmethodTest {
	
	public <E>void DisplayArryElement(E[] Element){
		for(E ele:Element) {
			System.out.println("Element : "+ele);
		}
		
	}

	public static void main(String[] args) {
		genericsmethodTest obj =new genericsmethodTest();
		
		Integer[] intarray= {11,2,3,45,5,2,678,8,6,4,43,4};
		String[] strarray= {"How","are","you","bro"};
		
		obj.DisplayArryElement(intarray);
		obj.DisplayArryElement(strarray);
		

	}

}
