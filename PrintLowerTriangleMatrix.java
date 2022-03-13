package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

public class PrintLowerTriangleMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{34,5,8},{9,87,5},{6,32,12}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i>=j)
				{
					System.out.print(a[i][j]+"  ");
				}
			}
			System.out.println();
		}
	}

}
