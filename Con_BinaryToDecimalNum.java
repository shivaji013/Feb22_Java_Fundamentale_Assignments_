package Assignment_java.Feb22_Java_Fundamentale_Assignments_;

public class Con_BinaryToDecimalNum {

	static int conBinaryToDecimal(int num){
		int d=0;
		int first=1;
		int temp=num;
		while(temp>0)
		{
		 int last_d=temp%10;
		 temp=temp/10;
		 d=d+last_d*first;
		 first=first*2;
		}
		return d;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10111001;
		System.out.println("Convert Binary To Decimal Number  :: "+conBinaryToDecimal(num));
	}

}
