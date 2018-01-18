package com.bellinfo.assign1;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 4 numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		/*int a=30;
		int b=10;
		int c=20;
		int d=50;*/
		minimumOfFourNumbers(a, b, c, d);

	}

	private static void minimumOfFourNumbers(int a, int b, int c, int d) {
		if(a<b && a<c && a<d){
			System.out.println("Minimum of 4 numbers is" + a);
		}
		if(b<a && b<c && b<d){
			System.out.println("Minimum of 4 numbers is" + b);
		}
		if(c<a && c<b && c<d){
			System.out.println("Minimum of 4 numbers is" + c);
		}
		if(d<a && d<b && d<c){
			System.out.println("Minimum of 4 numbers is" + d);
		}
	}

}
