package com.simple;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter desired number :- ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		System.out.println("Multiplication Table for "+a+" is :-");
		for(int n=1;n<=10;n++) {
			
			System.out.println(a+" x "+n+" = "+(a*n));
		}
		s.close();
		System.out.println("------------ End of Line -----------");
	}

}
