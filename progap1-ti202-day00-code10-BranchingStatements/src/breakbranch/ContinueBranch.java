package breakbranch;

public class ContinueBranch {

	public static void main(String[] args) {
		
		for (int iCtr=1; iCtr <= 10; iCtr++) {
			System.out.println("Javaworld." + iCtr);
			
			if (iCtr == 5) {
				continue;
			}
						
		}
		
		System.out.println("outside the loop");

	}

}
