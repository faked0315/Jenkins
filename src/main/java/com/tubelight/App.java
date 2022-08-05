package com.tubelight;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String args[]) {
		int i = 1;
		int j;
		int k;
				
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the Table Number : ");
		 j = input.nextInt();
		 System.out.print("How Many Times : ");
	     k = input.nextInt();
		 k += 1;
		 
		 while (i < k) {
			 int l = i * j;
			 System.out.print(i+" X "+j+" = "+l+"\n");
			 i += 1;	
	}
	
 }
}
