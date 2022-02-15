package Arrays;

import java.util.Scanner;

public class multiDArrayUser {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Row value");
		int m=sc.nextInt();
		System.out.println("Enter column value");
		int n=sc.nextInt();
		int [][] num= new int[m][n];
		
		
		System.out.println("Enter you value");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				num[i][j]=sc.nextInt();
				
			}

		}
		System.out.println("Display values");
		
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println();
			

		}

	}

}
