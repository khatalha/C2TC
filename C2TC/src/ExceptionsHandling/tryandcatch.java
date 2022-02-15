package ExceptionsHandling;

public class tryandcatch {
	public static void main(String[] args) {
//      try {
//          int data =45/0;
//      }
//      catch (ArithmeticException ae){
//          ae.printStackTrace();
//      }
//      System.out.println("this is the try and catch block");

      int []arr = new int[4];

      try {
          int i= arr[3];
      }
//      catch (Exception ae){
//          System.out.println("this is the catch block");
//      }
      finally {
          System.out.println("this is the finaly block");
      }

      System.out.println("this is the try and catch block");
  }

}
