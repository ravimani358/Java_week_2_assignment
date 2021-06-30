package week2.day2.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
	String str = "PayPal India";
		
	char[] charSet = str.toLowerCase().toCharArray();
		
	char[] dupCharSet = new char[str.length()];
		
		int i,j;
		
		for (i = 0; i<charSet.length; i++) {			
		
		 for(j = i+1; j<charSet.length; j++) {
			 
			 if(charSet[i] == charSet[j]) {
				 
				 dupCharSet[i] = charSet[i];
				 
				 System.out.println(dupCharSet[i]);
			 }
			 
		 	}
		 
		}
		
	}

}
