package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.ArrayList;

public class FindFirst_Index_In_Array {
	
	public static int findIndex(int arr[], int s)
	{
		ArrayList<Integer> clist= new ArrayList<>();
		
		for(int i : arr)
		clist.add(i);
		
		return clist.indexOf(s);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,3,4,6,5,7,8,9,0,23,45,67,87,90};
		
		System.out.println("first index of Array  ::"+findIndex(arr,3));
	}

}
