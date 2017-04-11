package dls.csb.finalKeyword.demo;

public class TestFinalKeyword {

	
	public static void main(String[] args) {
		
		final double PI = 3.14159;
		
		new Child().printMessage();
		System.out.println(PI);
		
	}

}

class Parent {
	
	String message = "Message from the parent class";
	
	public void printMessage() {
		message = "internal message";
		System.out.println(message);
	}
}

class Child extends Parent {
	
	public void printMessage() {
		System.out.println(this.message);
	}
	
}