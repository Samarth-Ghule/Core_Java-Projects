package com.StarPattern;

public class Traingle {
	public static void main(String[] args) {
	
		        int baseWidth = 5; 

		       
		        for (int i = 1; i <= baseWidth; i++) {
		            
		            for (int j = 1; j <= baseWidth - i; j++) {
		                System.out.print(" "); 
		            }
		         
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print("*"); 
		            }
		            
		            System.out.println();
		        }
		    }
		

	

}
