package Practiceprogram;

import java.util.Scanner;

public class XylemPhloemNumbers {

	public static void main(String[] args) {
		int num,extreme_sum=0,mean_sum=0,n;
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number");	
	   num=sc.nextInt();
	   num=Math.abs(num);
	   
	   n=num;
	   while(n!=0)
	   {
		   if(n==num || n<10)
			   extreme_sum=extreme_sum+ n%10; 
		   else
		   mean_sum=mean_sum+n%10;
		   n=n/10;
	   }
	   System.out.println("The extreme sum is  "+extreme_sum);
	   System.out.println("The mean sum is  "+mean_sum);
	   
	   if(extreme_sum==mean_sum)
		   System.out.println("the number is Xylem number");
	   
	   else
		   System.out.println("the number is Phloem number");

	}

}
