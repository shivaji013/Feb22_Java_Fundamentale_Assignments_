package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

public class SumOfAllArray {
	
  static int [] arr= {1,2,3,4,5,6};
	
	static int sum() {
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		sum=sum+arr[i];
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum of all array  :: "+sum());
	}

}
