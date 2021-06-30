package week2.day2.assignment;

import java.util.Arrays;

public class sortuscollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
				
		Arrays.sort(input);
		
		//System.out.println(input.length);
		
		for(int i = input.length-1 ; i>=0 ; i-- ) {
						
			System.out.println(input[i]);
			
		}
		
		
	}

}
