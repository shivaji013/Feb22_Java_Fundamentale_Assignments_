package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class Fibbonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        
        int num=scan.nextInt();
        System.out.println("Fibonacci series  :: ");
		int a=0,b=1;
		for(int i=0;i<=num;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

}
