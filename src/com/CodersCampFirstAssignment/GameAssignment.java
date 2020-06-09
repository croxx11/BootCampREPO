package com.CodersCampFirstAssignment;

import java.util.Random;
import java.util.Scanner;

public class GameAssignment {
	
	
	public static void main(String[] args) {
		
		Random randomNumber = new Random();
	    for (int a = 0; a<100;  a++) {
		System.out.println("Generated Number is:  " + randomNumber.nextInt(100));
		Integer generatedNumber = randomNumber.nextInt();
		
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Type in your Guess Number : ");
		 Integer guessNumber = scanner.nextInt();
		 
		 
				
		
		 if(generatedNumber != guessNumber) {
			 
		System.out.println("Typed in Guess Number Is InCorrect :  ");	 
			}
		
		 else if (generatedNumber.equals(randomNumber)) {
			 
		System.out.println("Typed in Guess Number Is Correct :  ");	  
			 
		 }
		  else {
		 
			System.out.println("Typed In Number is Invalid : You Loose ");
			System.out.println("Typed In Number is Invalid : You Loose ");	
			
			
			scanner.close();
	    } 
	}
}
	  	
}	
	
	
	
	
	


