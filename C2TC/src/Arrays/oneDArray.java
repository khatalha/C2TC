package Arrays;

import java.util.Scanner;

public class oneDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		int[] num =new int[n];
		
		System.out.println("Enter" +n+ "integer");
		
		
		for(int i=0;i<5;i++) {				//value from user
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {			//print data
			System.out.print(num[i]);
			System.out.println();
		}
		int a=num.length;			//len of the array
		System.out.println(a);

	}

}
