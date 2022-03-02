package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{

		int num,rem,rev=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number  ::");
		num=scan.nextInt();
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse Number  ::"+rev);
	}

}
