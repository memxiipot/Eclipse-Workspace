package dls.csb.quiztwo;

import java.util.*;

public class quizTwo {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String input = scan.nextLine();

		char acInput[] = input.toCharArray();
		
		String odd = "";
		
		for (char cInput : acInput) {
			switch (cInput) {
			case '1':
			case '3':
			case '5':
			case '7':
			case '9':
				
				odd += cInput;
				break;
			}
		}
		
		System.out.println("The odd numbers are the following: " + odd);
		
		
		
		
	}
	
}


