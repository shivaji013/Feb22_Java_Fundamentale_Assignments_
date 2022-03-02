package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class Swap_Two_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number  :: ");
		int num1=scan.nextInt();
		System.out.println("Enter the first number  :: ");
		int num2=scan.nextInt();
			
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Swap num1 to num2   ::"+num1);
		System.out.println("Swap num2 to num1   ::"+num2);
	}

}
