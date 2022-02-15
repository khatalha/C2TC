package Arrays;

import java.util.Scanner;

public class muliDiArray {

	public static void main(String[] args) {
		
		
		int [][] num= new int[3][3];
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter you value");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				num[i][j]=sc.nextInt();
				
			}

		}
		System.out.println("Display values");
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println();
			

		}

	}

}
