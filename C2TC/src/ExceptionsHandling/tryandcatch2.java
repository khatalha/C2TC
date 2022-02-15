package ExceptionsHandling;

public class tryandcatch2 {

	public static void main(String[] args) {
		int[] ary =new int[4];
        int a=35;
        int b = 5;
        int []arr = new int[4];
        try {
           if (b==0){
               throw new ArithmeticException("plese change the value of the B");
           }
           else {
               arr[3]=35;
               int c=  a/b;
               System.out.println("in try block");
               System.out.println(c);
           }

        }
//        catch (ArithmeticException ar){
//            System.out.println("this is the arithmetoic catch block");
//        }
        catch (ArrayIndexOutOfBoundsException ao){
            System.out.println("this is the ARRAY catch block");
        }
//        catch (Exception ae){
//            System.out.println("this is the ECETIONJ catch block");
//        }
        finally {
            System.out.println("this is the finaly block");
        }

        System.out.println("this is the CLASS block");

	}

}
