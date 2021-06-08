//: Create a method to find the sum of the cubes of the digits of an n digit number
package com.cg.lab1;

import java.util.Scanner;

public class Lab1Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter an Integer :");
		int num = sc.nextInt();
		int rem,sum = 0;
		while(num>0) {
			rem = num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		System.out.println(sum);
	}

}
