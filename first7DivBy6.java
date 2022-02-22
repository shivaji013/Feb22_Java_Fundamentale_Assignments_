package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class first7DivBy6 {

	public static void main(String[] args)
	{

		//first 7 terms of (n*6n) where divisible by 6
		
		System.out.println("Enter the number ::");
		
		int num=7;
		for(int i=1;i<=num;i++)
		{	
			int div=i*(6*i);
			System.out.println("Divisible by 6 ::"+div);
		}
	}

}
