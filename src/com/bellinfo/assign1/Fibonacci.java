package com.bellinfo.assign1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scan.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 1; i < n; i++) {
			int c = a + b;
			
			a = b;
			b = c;
			
			System.out.println(c);
		}

	}

}
