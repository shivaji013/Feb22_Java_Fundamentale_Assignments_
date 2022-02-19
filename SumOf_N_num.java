package Assignment_java;

import java.util.Scanner;

public class SumOf_N_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the any number : ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
	     sum=sum+i;
		}
		 System.out.println("Result :: "+sum);

		
	}

}
