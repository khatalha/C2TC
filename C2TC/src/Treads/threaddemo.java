package Treads;

public class threaddemo {

	public static void main(String[] args) {
		 threadclassdemo thread1 = new threadclassdemo("First", 2000);
	        threadclassdemo thread2 = new threadclassdemo("Second", 4000);

	        thread1.start();
	        thread2.start();
	        try {
	            thread1.join();
	            thread2.join();
	        }

	        catch (Exception e) {

	        }

	        for (int i = 0; i < 10; i++) {
	            try {
	                Thread.sleep(1000);
	            } catch (Exception e) {

	            }
	            System.out.println("main" + i);
	        }
	}

}
