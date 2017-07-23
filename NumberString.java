package week1day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		{
		int number1,number2,text;
		
		{		
			System.out.println("Enter a number:");
			Scanner value1= new Scanner(System.in);
			number1= value1.nextInt();
			System.out.println("Enter another number:");
			Scanner value2= new Scanner(System.in);
			number2= value2.nextInt();
			if (number1==number2)
		  	{
		  		System.out.println("The numbers are equal");
		  	}
		  	else
		  	{
		  		System.out.println("The numbers are not equal");
		  	}
			}
				    System.out.print("Enter a String");
		    
		  	Scanner s = new Scanner(System.in); 
		  	text= s.nextInt();
		  		  	
		}

}
}
