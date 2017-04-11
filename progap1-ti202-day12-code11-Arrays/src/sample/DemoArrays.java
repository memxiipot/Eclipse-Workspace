package sample;

public class DemoArrays {

	public static void main(String[] args) {
		
		System.out.println("Chapter 5 - Using Arrays");
		
		//sample integer array declaration 
		//10 = can accommodate 10 elements
		//ai = an array of integers, ia = integer of array
		int aiNumbers[] = new int[10];
		
		//sample character array declaration
		char acLetters[] = new char[10];
		
		//sample boolean array declaration
		boolean blnState[] = new boolean[10];
		
		//sample String array declaration
		String strNames[] = new String[10];
		
		aiNumbers[5] = 100;
		
		acLetters[2] = 'H';
		
		blnState[1] = false;
		
		strNames[3] = "Dirk Nowitzki"; 
		
		//will throw a runtime exception
		//strNames[-1] = "Leboron James";
		
		System.out.println("aiNumbers[5]: " + aiNumbers[5]);
		System.out.println("acLetters[2]: " + acLetters[2]);
		System.out.println("blnState[1]: " + blnState[1]);
		System.out.println("strNames[3]: " + strNames[3]);
		
		
		

	}

}
