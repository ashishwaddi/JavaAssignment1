package com.bellinfo.assign1;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n =scan.nextInt();
		for(int i=2;i<n;i++ ) {
			if(n%i !=0) {
				System.out.println(n + " is  a prime number");
				break;
			}else {
				System.out.println(n + " is not a prime number");
				break;
			}
			
		}
		
		
	}

}
