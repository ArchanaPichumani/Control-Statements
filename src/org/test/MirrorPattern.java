package org.test;

public class MirrorPattern {
	
	public static void main(String[] args) {
		

		for (int i=0; i<8;i++) {

			for(int j=1; j<8-i;j++) {
											
				System.out.print(" ");		
						
						
			}
			for (int k=0;k<=i;k++) {
			System.out.print(k);
			

}
			System.out.println();
	}
}
}
