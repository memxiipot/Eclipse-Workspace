package midterms.main;

import java.io.*;
import java.util.*;


public class MidtermsMain {

	private static Scanner scan;
	
	public static void main(String[] args) throws IOException {
		
		scan = new Scanner(System.in);
		BufferedReader reader = 
				 new BufferedReader (new InputStreamReader(System.in));
		
		int list[] = new int[4];
		
		System.out.println("Enter Number 1: ");
		int num1 = scan.nextInt();
		System.out.println("Enter Number 2: ");
		int num2 = scan.nextInt();
		System.out.println("Enter Number 3: ");
		int num3 = scan.nextInt();
		System.out.println("Enter Number 4: ");
		int num4 = scan.nextInt();
				
		list[0] = num1;
		list[1] = num2;
		list[2] = num3;
		list[3] = num4;
		
		
		
		if (num1 > num2 && num2 < num3 && num3 < num4 && 
				num1 < num2 && num2 > num3  &&  num3 < num4)
		{
			System.out.println("The second smallest number is: " + list[0]);
		} else if (num1 < num2 && num2 < num3 && num3 < num4 && 
						num1 > num2 && num2 < num3  &&  num3 > num4  && 
							num1 > num2 && num2 > num3 && num3 < num4)
		{
			System.out.println("The second smallest number is: " + list[1]);
		} else if (num1 < num2 && num2 > num3 && num3 < num4 && 
						num1 > num2 && num2 > num3  &&  num3 > num4)
		{
			System.out.println("The second smallest number is: " + list[2]);
		} else
		{
			System.out.println("The second smallest number is: " + list[3]);
		}
		
		
		
		

	}

}
