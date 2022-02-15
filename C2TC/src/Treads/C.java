package Treads;

public class C implements Runnable {
	 int h;
	    int l;
	    String msg;

	    public C(int h, int l, String msg) {
	        this.h = h;
	        this.l = l;
	        this.msg = msg;
	    }

	    @Override
	    public void run() {
	        for(int i=h;i>l;i--)
	        {
	            try
	            {
	                Thread.sleep(2000);
	            }
	            catch(Exception e)
	            {

	            }
	            System.out.println(msg + i);
	        }

	    }
}
