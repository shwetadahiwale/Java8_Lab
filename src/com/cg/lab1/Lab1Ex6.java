package com.cg.lab1;

//Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.



import java.util.Scanner;

public class Lab1Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an intteger:");
		int num = sc.nextInt();
		int i;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (i = 1; i <= num; i++) {
			sum1 += i * i;
		}
		{
			System.out.println("The square of the sum:" + sum1);
			for (i = 1; i <= num; i++) {
				sum2 += i;
			}
		}
		System.out.println("Sum of the square:" + sum2);
		sum3 = sum1 - (sum2 * sum2);
		System.out.println("Difference is :" + sum3);

	}
}

