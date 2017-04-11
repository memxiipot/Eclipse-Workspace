package dls.csb.phoneexercise;

import java.util.Scanner;

public class function {

	public static int Smartctr;
	public static int Globectr;
	public static int Sunctr;
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		PhoneKeyPad phone = new PhoneKeyPad();
		
		System.out.println("Enter a mobile number: ");
		String phoneNum = scan.nextLine().toUpperCase().trim();
		
		String prefix = "";
		
		char number[] = phoneNum.toCharArray();
		
			for(int x = 0; x < 4; x++)
			{
				prefix += number[x];	
			}
		
		System.out.println("Your telecommunication company is " + phone.getTelcoProvider(prefix));
		String num = "";
		
			for(int y = 5; y < phoneNum.length(); y++)
			{
				num += number[y];
			}
			
			if(phone.convertToNumericMobile(num).equals("Invalid"))
			{
				System.out.println("Input should not be over or under 7 characters");
								
				
			} else { 
				
				System.out.println("Your phone number is " + prefix + "-" + phone.convertToNumericMobile(num));
			
			
			
			
			
		
				if(phone.getTelcoProvider(prefix) == "Smart")
				{
					Smartctr++;
				} else if(phone.getTelcoProvider(prefix) == "Globe") {
					Globectr++;
				} else if(phone.getTelcoProvider(prefix) == "Sun") {
					Sunctr++;
				}
			
			}
			
			
			
		System.out.println("Do you want to continue? [Y/N]");
		String yesNo = scan.nextLine();
		
		if(yesNo.equalsIgnoreCase("Y"))main(args);
		
		else {
			
			System.out.println("Thank you very much for using the system.");
			System.out.println("--------------------------------------------------------");
			System.out.println("Smart :" + Smartctr);
			System.out.println("Globe :" + Globectr);
			System.out.println("Sun :" + Sunctr);
		
		}		
		
	}
}
