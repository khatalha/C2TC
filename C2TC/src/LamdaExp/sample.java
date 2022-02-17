package LamdaExp;



interface interf {
    //public void test();  //its throw the Error bcoz is @FunctionalInterface.we can't creat multiple method
    // @FunctionalInterface have only one method
    public void test(int a);

}
public class sample {

	public static void main(String[] args) {

        interf i =(a) -> System.out.println("hello world "+a);
        i.test(5);

        big be =() -> System.out.println("hello world ");
        be.samp();

        small s =(a,b) -> System.out.println(a+b);
        s.samp1(5,3);
        s.samp1(50,3);
        s.samp1(54,3);
        s.samp1(53,3);

        squareIt sq =(n)-> n*n;
        System.out.println(sq.sqare(5));
        
        cheackIt chk =n->n%2==0;
        System.out.println(chk.check(6));
        System.out.println(chk.check(3));
        




	}

}
