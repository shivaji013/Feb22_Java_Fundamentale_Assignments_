import java.util.Scanner;

public class Table_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBERS TABEL : ");
		int num=scan.nextInt();
		
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(""+i*num);
		}
	}

}
