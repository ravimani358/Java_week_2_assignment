package week2.day2.assignment;


import java.util.ArrayList;
import java.util.List;


public class duplicatescollection {

	public static void main(String[] args) {
		
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
		List values = new ArrayList();
		
		for(int i=0;i<data.length;i++) {
			
			values.add(data[i]);
			
		}
			for(int j =0; j<values.size();j++) {
				
				for(int k=j+1; k<values.size();k++) {
					
					if(values.get(j) == values.get(k)) {
						
						System.out.println(values.get(j));
						
					}
					
				}
				
				
			}
			
	}

}
