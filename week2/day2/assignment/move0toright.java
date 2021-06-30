package week2.day2.assignment;  

public class move0toright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] all_num = {4,0,3,0,1,5,2,0};
		
		int i,j;
		
		for(i=0; i<all_num.length; i++) {
	
			if(all_num[i] !=0) {
				
				System.out.println(all_num[i]); 
				
			}
			
		}
		
		for(j = 0; j<all_num.length;j++) {
		
			if(all_num[j] ==0) {
				System.out.println(all_num[j]);
			}
		
		}
		
	}
}