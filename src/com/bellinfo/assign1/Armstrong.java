package com.bellinfo.assign1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = scan.nextInt();

		int r,  res = 0;
		int temp = n;
		
		while(n>0) {
		r = n % 10;
		n = n / 10;
		res = res + (r*r*r);
		}
		
		if (temp == res) {
			System.out.println(res + " is a Armstrong number");
		}else {
			System.out.println(temp  + " is not a Armstrong number");
		}
		
		
		
	}

}
