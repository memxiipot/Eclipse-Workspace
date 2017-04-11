package breakbranch;

public class BreakBranch {

	public static void main(String[] args) {
		
		for (int iCtr=1; iCtr <= 10; iCtr++) {
			System.out.println("Javaworld." + iCtr);
			
			if (iCtr == 5) {
				System.out.println("terminating the loop");
				break;
			}
						
		}
		
		System.out.println("outside the loop");

	}

}
