package PredefindMethod;

interface Sam{
	public void Add(int a,int b);
}

public class DoblColonwithArgument {
	
	public static void Sum(int x,int y) {
		System.out.println("the sum is"+(x+y));
	}

	public static void main(String[] args) {
		
		Sam s=(n1,n2)->System.out.println("the sum is"+(n1+n2));
		s.Add(5, 8);
		
		Sam t=DoblColonwithArgument::Sum;
		t.Add(2, 3);
	}

}
