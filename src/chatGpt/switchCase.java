package chatGpt;

import java.util.Scanner;

public class switchCase {
	
	
	

	///////////////////////////////////
	/////// WRITEN incorrect answer    ////////
	///////		Below 			/////
	
	public static void main(String[] args) {
		// mamking a switch case
//		Scanner in = scanner.next input;
//		Scanner = new scanner(input1);
//		String dayLower = day.toLowerCase();
//		switch (dayLower ) {
//		case "monday";
//		case "tuesday";
//		
//		}
//		
		
		
		
		
		///////////////////////////////////
		/////// correct answer    ////////
		///////		Below 			/////
		// creats a scaner for firt object
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a day of the week");
		
		// makes the input a variable
		String day = in.next();
		
		// lower cases the input
		String dayLower = day.toLowerCase();
		
	//	while String != "stop"{ 
		
		while(!dayLower.equals("stop")) { 
			switch(dayLower) { 
		}
		
		switch(dayLower) { 
		case "monday" : 
			System.out.println("it is monday");
			break ;
		case "tuesday" :
			System.out.println("It is tuesday");
			break;
		case"wednesday":
			System.out.println("It is wednesday");
			break;
		case"thursday":
			System.out.println("It is thursday");
			break;
		case"friday":
			System.out.println("It is friday");
			break;
		case"saturday":
			System.out.println("It is saturday");
			break;
		case"sunday":
			System.out.println("It is sunday");
			break;
			
			default : 
				System.out.println("Invalid day");
				break;
		}
		day = in.next();
		
		dayLower = day.toLowerCase();
		}
		in.close();
		
	}

}
