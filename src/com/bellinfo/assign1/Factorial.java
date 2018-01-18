package com.bellinfo.assign1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		int a = 1;
		for (int i = 1; i <= n; i++) {
			a = a * i;
		}
		System.out.println(a);

	}

}
