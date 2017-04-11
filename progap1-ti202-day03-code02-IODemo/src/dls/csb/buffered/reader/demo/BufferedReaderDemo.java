package dls.csb.buffered.reader.demo;

import java.io.*;

public class BufferedReaderDemo {
	private static BufferedReader reader;
	public static void main(String[] args) throws IOException {
		
		reader = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		String name = reader.readLine();
		
		System.out.println("Enter your course: ");
		String course = reader.readLine();
		
		System.out.println("Enter your year level: ");
		String yearLevel = reader.readLine();
		
		System.out.println("Hi, your name is " + name);
		System.out.println("Your course is " + course);
		System.out.println("Your year level is " + yearLevel);
			
	}

}
