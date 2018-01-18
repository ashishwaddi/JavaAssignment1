package com.bellinfo.assign1;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = scan.nextInt();

		int res = 0;
	//	int temp = n;
		for(int i=1;i<n;i++) {
			if(n%i == 0) {
				res = res + i;
			}
			
		}
		if(n == res) {
			System.out.println(n + " is a perfect number");
		}else {
			System.out.println(n + " is not  a perfect number");

		}
	}

}
