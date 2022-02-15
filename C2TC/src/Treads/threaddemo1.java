package Treads;

public class threaddemo1 {

	public static void main(String[] args) {
		 C oa1=new C(10,1,"FIRST");
	        C oa2=new C(5,0,"SECOND");
	        B ob=new B("THIRD");

	        Thread t1=new Thread(oa1);
	        Thread t2=new Thread(oa2);
	        Thread t3=new Thread(ob);

	        t1.start();
	        t2.start();
	        t3.start();
	        t3.setPriority(Thread.MAX_PRIORITY);

	        try
	        {
	            t1.join();
	            t2.join();
	            t3.join();
	        }
	        catch(Exception e)
	        {
	        }
	        System.out.println("HAVE  A NICE DAY");
	}

}
