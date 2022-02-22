//Find the first 3 terms of 4N+9 where it is divisible by 3

package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class first3_divisible_by3 {

	public static void main(String[] args) {

		System.out.println("Enter the number first three ::");

		int num = 3;
		for (int i = 1; i <= num; i++) 
		{
			
			if(i%3==0)
			{
			   int div = 4 * i + 9;
			   System.out.println("Divisible by 3 :"+div);
			}
			
		}
	}

}
