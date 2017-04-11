package dls.csb.phoneexercise;

public class PhoneKeyPad {

	private String telcoPrefix;
	private String mobileNumber = "";
	
	public String getTelcoProvider(String prefix) {
		
		String num = "";
		
		switch(prefix)
		{
			
			case "0919":
			case "0920":
				telcoPrefix = "Smart";
				break;
			case "0917":
			case "0927":
				telcoPrefix = "Globe";
				break;
			case "0922":
			case "0933":
				telcoPrefix = "Sun";
				break;
			default:
				telcoPrefix = "Invalid ";
		
		}
		
		return telcoPrefix;
		
	}


		
	
	public String convertToNumericMobile(String phoneNum) {
		
		
		
		if(phoneNum.length() == 7)
		{
			
			char aNum[] = phoneNum.toCharArray();
			
			for(int x = 0; x < phoneNum.length(); x++)				
			{
				
				switch(aNum[x])
				{
					case 'A':
					case 'B':
					case 'C':
						mobileNumber += "2";						
						break;
					case 'D':
					case 'E':
					case 'F':
						mobileNumber += "3";
						break;
					case 'G':
					case 'H':
					case 'I':
						mobileNumber += "4";
						break;
					case 'J':
					case 'K':
					case 'L':
						mobileNumber += "5";
						break;
					case 'M':
					case 'N':
					case 'O':
						mobileNumber += "6";
						break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
						mobileNumber += "7";
						break;
					case 'T':
					case 'U':
					case 'V':
						mobileNumber += "8";
						break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
						mobileNumber += "9";
						break;
				}
					
			}
			
		} else {
			
			mobileNumber = "Invalid";
			
		} return mobileNumber;
		
		
		
	
	
	}

}
