
public class Even_num_1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*//Wap to print 2 ,4 ,6 ,8 ,10 using for loop 
		 * 
		 * 
		 * System.out.println("Even number using 'For loop'");
		 * for(int i=1;i<=10;i++) { if(i%2==0) { System.out.println(" for loop ::"+i); } }
		 */	
		
		
		// Wap to print 2 ,4 ,6 ,8 ,10 using while loop
		
		int i;
		i=1;
		System.out.println("Even number using 'while loop'");
		while(i<=10)
		{
			if(i%2==0)
			{
			System.out.println(" while loop ::  "+i);
			}
			i++;
		}
	}
}
