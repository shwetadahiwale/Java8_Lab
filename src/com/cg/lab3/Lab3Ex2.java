package com.cg.lab3;

import java.util.Scanner;

public class Lab3Ex2 {
	public static void main(String args[]) {
		
		String initial, rev = "";
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		initial = s.nextLine();
		int length = initial.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + initial.charAt(i);
		System.out.println("Reversed string: " + rev);
	}
}
