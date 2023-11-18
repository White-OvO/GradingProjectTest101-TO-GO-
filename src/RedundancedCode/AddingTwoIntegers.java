package RedundancedCode;

import java.util.Scanner;

public class AddingTwoIntegers {

	public static void main(String[] args) {
		// create the object the final result
		// plus value is the name of the array that is named in the begining 
		AddingTwoIntegers plusValue = new AddingTwoIntegers();
		// calls to the add method to print result
//		System.out.println(plusValue.add(5,10));
	
		
		// this method calls out to the user for two diffrent inputs
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers for addition : \t");
		System.out.println("Enter the first value : \n");
		int a = in.nextInt();
		System.out.println("Enter the second value : \n");
		int b = in.nextInt();
		System.out.println("The additional total value is : " +plusValue.add(a, b) );
		System.out.println();
		
		

		DividingTwoIntegers divisionValue = new DividingTwoIntegers();
		
		// this method prints the value of a / b 
		//System.out.println(divisionValue.divide(10, 2));
		
		
		// this method will make the user to input the variable for the set of numbers
		
		System.out.println("Enter the first number to divide \n");
		Scanner intD1 = new Scanner(System.in);
		
		int d1 = intD1.nextInt();
		System.out.println("Enter the second number to divide : \n");
		int d2 = intD1.nextInt();
		
		System.out.println("The next two variables divided are : "
				+ "\n" + divisionValue.divide(d1, d2));
		
		
		
		
	}
	
	public int add(int a , int b) {
//	int result = a + b;
//	return result;
	
	return a +b;
}
public static class DividingTwoIntegers { 

	public int divide(int d1, int d2) { 
	int result = d1 / d2;
	return result;
		}
	}
}