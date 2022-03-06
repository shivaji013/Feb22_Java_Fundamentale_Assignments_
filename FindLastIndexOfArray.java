package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

import java.util.ArrayList;

public class FindLastIndexOfArray {

	static int LastIndex(int arr[], int t) {
		
		ArrayList<Integer> cList=new ArrayList<Integer>();
		
		for(int i : arr)
			cList.add(i);
		return cList.indexOf(t);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {23,44,4,56,77,99,88};
		System.out.println("Find the Last Index of all element of array  ::"+LastIndex(arr,88));
	}

}
