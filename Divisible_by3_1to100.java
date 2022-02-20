//WAP to print divisible by 3 from 1 to 100

package Assignment_java;

public class Divisible_by3_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=100;
		System.out.println("Divisile by 3 from 1 to 100 :: ");
		for(int i=1;i<=num;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}

}
