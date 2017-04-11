package sample;

import java.util.*;

public class HelloWorld {
	private static Scanner scan;
	/*
	Function: Main
	Description: Prints the HelloWorld and other statements
	*/
	public static void main(String[] args) {
		System.out.println("Hello World using Java SE application");
		System.out.println("I love Java programming. I will always study everyday.");
		System.out.println("Programmed by Marie Chrys Brito");
		
		System.out.println("Addition: " + ("5" + 6)); //Concatenation
		System.out.println("Addition: " + (5 + "6"));
		System.out.println("Addition: " + (5 + 6));
		System.out.println("Addition: " + ((5 + 6) + "3"));
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		
		System.out.println("Hello, " + name);

	}

}
