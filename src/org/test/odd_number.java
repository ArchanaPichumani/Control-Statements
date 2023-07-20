package org.test;

public class odd_number {
	
	public static void main(String[] args) {
		System.out.println("Sum of Odd Numbers:");
				
		//int n=5;
		int result=0;
		
		for(int i=1; i<=5;i++) {
						
						if(i%2==1) {
							//System.out.println(i);
							
							result=i+result;	
		}
				
		}
		System.out.println(result);
	
	
}
}