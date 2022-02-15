package keywords;
class sample{
    int a=12;
    private int c=15;
    protected int d=32;
    public int b=13;

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a+b+c+d);
    }

}
class child extends sample {
    void display() {
        System.out.println(a);
        System.out.println(b);
//        System.out.println(c);
        System.out.println(d);
//        System.out.println(a + b + c + d);

    }
}

public class accessmodifire {

	public static void main(String[] args) {
		sample s1 = new sample();
        s1.display();

	}

}
