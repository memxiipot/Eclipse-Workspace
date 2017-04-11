package dls.csb.exer;

import java.util.*;

public class Exercise {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		Exercise exer = new Exercise();
		scan = new Scanner(System.in);
				
System.out.println("Enter a sentence : ");
		
		String sentence = scan.nextLine();
		
		int count = 65;
		
		System.out.println("\nOutput:\nDEC\tCHAR\tOCC");
		
		while(count >= 65 && count <= 122)
		{
			if(exer.Check(count, sentence) != 0)
			{
				System.out.println(count + "\t" + (char)count + "\t" + 
						exer.Check(count, sentence));
			}
			
			count++;
		}
		
		count = 0;
		
		while(count < 65 || count > 122)
		{
			if(exer.Check(count, sentence) != 0)
			{
				if (count != 32 && count != 9)
				{
					 System.out.println(count + "\t" + (char)count + "\t" + 
							 exer.Check(count, sentence));
				}
			}
			
			count++;
		}
		
		count = 0;
		
		int invisibleCharCount = 0;
		
		while(count <= 65 || count >= 122)
		{
			if(exer.Check(count, sentence) != 0)
			{
				if (count == 32)
				{
					 System.out.println(count + "\t<spc>\t" + 
							 exer.Check(count, sentence));
					 invisibleCharCount = invisibleCharCount + exer.Check(count, sentence);
				}
				if(count == 9)
				{
					System.out.println(count + "\t<tab>\t" + 
							 exer.Check(count, sentence));
					 invisibleCharCount = invisibleCharCount + exer.Check(count, sentence);
				}
			}
			
			count++;
		}
		
		System.out.println("====================");
		
		System.out.println("\nTotal # of visible characters : " + (sentence.length() - 
					invisibleCharCount));
		
		System.out.println("Total # of invisible characters : " + invisibleCharCount);
		
		System.out.println("Total characters : " + sentence.length());
		
	}
	
	
	public int Check(int count, String sentence)
	{
		int counter = 0;
		
		int characterCount = 0;
		
		while(counter < sentence.length())
		{
			int dec = sentence.charAt(counter);
			
			if (dec == count)
			{
				characterCount++;
			}
			
			counter++;
		}
		
		return characterCount;
		
	}

}