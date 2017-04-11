
package exchange.reader;

import java.util.Scanner;

public class Reader {
	
	private static Scanner scan;
	
	public static int readInt(String msg) {
		scan = new Scanner(System.in);
		System.out.println(msg + ": ");
		return scan.nextInt();
	}
	
	public static String readString(String msg) {
		scan = new Scanner(System.in);
		System.out.println(msg + ": ");
		return scan.nextLine();
	}
	
	public static double readDouble(String msg) {
		scan = new Scanner(System.in);
		System.out.println(msg + ": ");
		return scan.nextDouble();
	}

}
