package PredefindMethod;

// doubleColon(::) when we using argument must be same of method

public class doubleColon {
			
//	public static void m1() {	// static method
//		for(int i=0; i<10; i++) {
//			System.out.println("This the M1 method");
//		}
//	}
	private int m1() {// return value if does't use any  value integer
		for(int i=0; i<10; i++) {
			System.out.println("This the M1 method");
		}
		return 10;//value return
	}
	public static void main(String[] args) {
		
		doubleColon d1=new doubleColon();
		Runnable r= d1::m1;//method reference using double colon for intence method
		//Runnable r= doubleColon::m1;//method reference using double colon for static method
		Thread t= new Thread(r);
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("This the ");
		}

	}

}
