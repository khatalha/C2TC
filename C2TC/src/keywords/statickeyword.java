package keywords;


class staticdemo{
    int a=10;
    int b;
    static int c=20;

    void fun1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    static void fun2(){
        int d= 5;
        System.out.println(d);
        System.out.println(c);
    }
    static {
        System.out.println("hi iam static member1");
//        System.exit(0);
    }
    static {
        System.out.println("hi iam static member2");
//        System.exit(0);
    }

}
public class statickeyword {

	public static void main(String[] args) {
		 System.out.println(staticdemo.c);
	        staticdemo sk =new staticdemo();

	        sk.fun1();
	        staticdemo.fun2();
	}

}
