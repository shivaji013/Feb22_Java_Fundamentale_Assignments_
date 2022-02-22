//Check if a given number is divisible by 2 and 8 but not 12

package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class Divisi2And8butNot12 {

	public static void main(String[] args) {

		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Any number ::");
		num = scan.nextInt();

		// Logic 2 and 8 divisible but not 12 divisible
		 String divisible=""; 
		 divisible=(num%2==0 && num%8==0 || num%12==0)?"divisible 2,8 = :: " : "Not divisible 12  ::";
		 System.out.println(divisible);
	} 
		
}
