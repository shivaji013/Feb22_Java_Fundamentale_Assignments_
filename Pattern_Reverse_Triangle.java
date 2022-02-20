package Assignment_java;

public class Pattern_Reverse_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}

}
