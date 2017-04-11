package dls.csb.scanner.demo;

import java.util.*;

public class ScannerDemo {
	private static Scanner scan;
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter your username: ");
		String uname = scan.nextLine();
		
		System.out.println("Enter your password: ");
		String pass = scan.nextLine();
		
		if (uname.equals("marie") && pass.equals("pass")) {
			System.out.println("Enter your course: ");
			String course = scan.nextLine();
			
			System.out.println("Enter your your level: ");
			int yearLevel = scan.nextInt();
			
			System.out.println("Hi, Your name is " + name);
			System.out.println("Your course is " + course);
			System.out.println("Your year level is " + yearLevel);
			
			if (yearLevel == 1) {
				System.out.println("Freshman");
			}
			else if (yearLevel == 2) {
				System.out.println("Sophomore");
			}
			else if (yearLevel == 3) {
				System.out.println("Junior");
			}
			else if (yearLevel == 4) {
				System.out.println("Senior");
			}
			else if (yearLevel <= 0 || yearLevel > 4) {
				System.out.println("Invalid year level");
			}
						
		}
		else {
			System.out.println("Invalid user account entered");
		}
		
	}

}
