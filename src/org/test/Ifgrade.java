package org.test;

import java.util.Scanner;

public class Ifgrade {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Grade:");
		
		int g= sc.nextInt();
						
		if(g<50) {
			System.out.println("Fail");
		}
		
		else if(g>=50 & g<=60) {
			System.out.println("Average");
					}
			
		else if (g>60 & g<=70) {
			System.out.println("Good");
					}
		
		else if(g>70 & g<=80) {
			System.out.println("Outstanding");
		}
		
				else {
			System.out.println("Exceptional");
		
		
		
	}
		
	}

}
