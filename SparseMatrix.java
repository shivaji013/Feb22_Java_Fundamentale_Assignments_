package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of matrix  :::");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Row matrix by Any 2,3,4 :");
		int row=sc.nextInt();
		System.out.print("Enter the Col matrix by Any 2,3,4 :");
		int col=sc.nextInt();
		
		int mat[][]=new int[row][col];
		int zeroMax=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
				if(mat[i][j]==0)
				{
					zeroMax++;
				}	
			}
		}
		if(zeroMax>(row*col)/2)
		{
			System.out.println("The matrix is a Sparse Matrix :");
		}
		else
		{
		    System.out.println("The matrix Not a Sparse Matrix :");	
		}
	}

}
