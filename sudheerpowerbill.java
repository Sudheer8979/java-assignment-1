package com.printpowerbill.test;

import java.util.Scanner;

public class Powerbill {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 double bill;

		System.out.println("enter the number of units");
		
		double unit = sc.nextDouble();

		if (unit < 100) {
			bill =(unit * 2.50);
			System.out.println("Your total power bill=" + bill);
		}

		if (unit >= 100 & unit < 500) {
			bill = (unit - 100) * 3;
			System.out.println("Your total power bill=" + ((100 * 2.5) + (bill)));
		}

		if (unit >= 500) {
			bill = (unit - 500) * 4.5;
			System.out.println("Your total power bill=" + (((100 * 2.5) + (400 * 3.0) + bill)));

		}

	}
}
