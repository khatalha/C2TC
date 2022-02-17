package PredefindMethod;

class Sample{
	
	Sample(int a,int b,String s){
		System.out.println("THIS THE SAMPLE CLASS ARE USIN THE INTERFACE JAM");
		System.out.println(a+b);
	}
	Sample(){
		System.out.println("THIS THE SAMPLE CLASS ARE USIN THE INTERFACE JAM");
	}
		
}

interface jam{
	public Sample Add(int x,int y,String z);//Sample class is used
	
}

public class construtMethodWithcolon {

	public static void main(String[] args) {
		
		//jam j=Sample::new;
		//Sample s1= j.Add();// without Argument 
		
		jam j=Sample::new;// Contructor  refernce
		Sample s1= j.Add(4,7,"talha");
		Sample s2= j.Add(1,7,"Sajid");
		Sample s3= j.Add(4,9,"Ali");
		

	}

}
