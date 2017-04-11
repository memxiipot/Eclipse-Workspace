package sample2;

public class ArrayDeclarationWithInitialization {

	
	public static void main(String[] args) {

		int aiNumbers[] = {5, 10, 100, 20};
		
		boolean blnConditions[] = {false, true, false, true};
		
		char acWord[] = {'J', 'a', 'v', 'a'};
		
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", 
				"Thursday", "Friday", "Saturday"};
		
		System.out.println("days[3]: " + days[3]);
		System.out.println("blnConditions[0]: " + blnConditions[0]);
		System.out.println("acWord[3]: " + acWord[3]);
		System.out.println("aiNumber[2]: " + aiNumbers[2]);
		System.out.println("days[5]: " + days[5]);
		
		//test if array objects created are indeed of type java.lang.Object
		
		if (aiNumbers instanceof Object) {
			System.out.println("aiNumbers IS AN Object.");
			}
		else {
			System.out.println("aiNumbers IS NOT AN Object.");
			}
		
		
		if (days instanceof Object) {
			System.out.println("days IS AN Object.");
			}
		else {
			System.out.println("days IS NOT AN Object.");
			}
		
		int ctr = 0;
		System.out.println("Printing all the contents of the integer array number using while loop");
		while (ctr < 4) 
			{
				System.out.println("aiNumbers [" + ctr + "]: "+ aiNumbers[ctr]);
				ctr++;
			}
		
		//print all the contents of the blnConditions array number using do-while loop
		ctr = 0;
		do 
			{
				System.out.println("blnConditions [" + ctr + "]: "+ blnConditions[ctr]);
				ctr++;
				
			} while (ctr < 4); // while (ctr < blnConditions.length);
		
		//print all the contents of the blnConditions array number using do-while loop
		
		System.out.println("Printing all the contents of the character array number using for loop");
		
		for (ctr = 0; ctr < 4 ; ctr++)
			{
				System.out.println("acWord [" + ctr + "]: "+ acWord[ctr]);
			}
		
		System.out.println("\nPrint all the contents of a String array number using for each");
		for(String araw:days )
			{
			System.out.println(araw);
			}
		
	
	

	}

}
