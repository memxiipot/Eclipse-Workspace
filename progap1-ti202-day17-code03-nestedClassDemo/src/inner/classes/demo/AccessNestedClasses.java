package inner.classes.demo;

public class AccessNestedClasses {

	
	public static void main(String[] args) {
		
		Outer outerObj = new Outer(); 
		System.out.println(outerObj.getMessage());
		
		Outer.Inner innerObj = new Outer().new Inner();	 //1
		//or Outer.Inner innerObj = outerObj.new Inner();	
		System.out.println(innerObj.getMessage());
		
		Outer.Inner.InnerInner innnerObj = //2
				new Outer().new Inner(). new InnerInner();
		System.out.println(innnerObj.getMessage());
		
		Outer.Inner.InnerInner.InnerInnerInner innnnerObj = //3
				new Outer().new Inner().new InnerInner().new InnerInnerInner();
		System.out.println(innnnerObj.getMessage());
		
		Outer.Inner.InnerInner.InnerInnerInner.InnerInnerInnerInner innnnnerObj = //4
				new Outer().new Inner().new InnerInner().new InnerInnerInner(). new InnerInnerInnerInner();
		System.out.println(innnnnerObj.getMessage());
	
		Outer.Inner.InnerInner.InnerInnerInner.InnerInnerInnerInner.InnerInnerInnerInnerInner innnnnnerObj = //5
				new Outer().new Inner().new InnerInner().new InnerInnerInner(). 
				new InnerInnerInnerInner(). new InnerInnerInnerInnerInner();
		System.out.println(innnnnnerObj.getMessage());
		
		Outer.Inner.InnerInner.InnerInnerInner.InnerInnerInnerInner.InnerInnerInnerInnerInner.InnerInnerInnerInnerInnerInner innnnnnnerObj = //6
				new Outer().new Inner().new InnerInner().new InnerInnerInner(). 
				new InnerInnerInnerInner(). new InnerInnerInnerInnerInner().
				new InnerInnerInnerInnerInnerInner();
		System.out.println(innnnnnnerObj.getMessage());
				
	}

}
//nesting
//to create inner, traverse from outer to inner

class Outer {
	
	public String message = "I am the outer class message";
	
	public String getMessage(){
		return message;
	}
	
	//sample inner class
	
	class Inner { //1
		
		public String message = "I am the inner class message";
		
		public String getMessage(){
			return message;
			
		}
		
		class InnerInner { //2
			
			public String message = "I am the inner inner class message";
			
			public String getMessage(){
				return message;
			}
			
			class InnerInnerInner { //3
				
				public String message = "I am the inner inner inner class message";
				
				public String getMessage(){
					return message;
				}
				
					class InnerInnerInnerInner { //4
						
						public String message = "I am the inner inner inner inner class message";
						
						public String getMessage(){
							return message;
						
						}
						
				
					
						class InnerInnerInnerInnerInner { //5
							
							public String message = "I am the inner inner inner inner inner class message";
							
							public String getMessage(){
								return message;
							
						}
							
							class InnerInnerInnerInnerInnerInner { //6
								
								public String message = "I am the inner inner inner inner inner inner class message";
								
								public String getMessage(){
									return message;
								
							}
								
						}
							
					}
					
				}
					
			}
			
		}
				
	}
	
}