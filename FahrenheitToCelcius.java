package Assignment_java.Feb22_Java_Fundamentale_Assignments_;


import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*WAP to convert temperature from Fahrenheit to Celsius degree.*/
		
		float fahrenheit;
		float celcius;
		Scanner scan=new Scanner(System.in);
		
		// User input fahrenheit value
		System.out.print("Enter the fahreheit value = ");
		fahrenheit=scan.nextFloat();
		
		//Logic Fahrenheit to Celcius 
		celcius=((fahrenheit-32)*5)/9;
		
		// Display result
		System.out.println("fahrenheit to celcius :: "+celcius);
	}

}
