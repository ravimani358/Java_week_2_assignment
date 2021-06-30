package week2.day2.assignment;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		int i, j;
		
		// System.out.println(arr[0]);
				
		for(i= 0 ; i<=arr.length-1; i++) {
			
			System.out.println(arr[i]);
			
		}

	}

}
