package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class FindOddAndEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum of the matrix 3x3 matrix   :::");
		Scanner sc=new Scanner(System.in);
	    int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sumEven=0;
		int sumOdd=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]%2==0)
				 sumEven=sumEven+arr[i][j];
				else
				 sumOdd=sumOdd+arr[i][j];
			}
		}
		System.out.println("Sum Matrix of Even num ::"+sumEven);
		System.out.println("Sum Matrix of Odd num  ::"+sumOdd);
	}

}
