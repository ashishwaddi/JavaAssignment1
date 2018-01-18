package com.bellinfo.assign1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		int t = num;
		int r;
		int s =0;
		while(num > 0) {
		r = num % 10;
		num = num/10;
		s = s * 10 + r;
		
		}
		
		if(t == s) {
			System.out.println("is a palindrome ");
		}else {
			System.out.println("is not a palindrome");
		}
	
	}

}
