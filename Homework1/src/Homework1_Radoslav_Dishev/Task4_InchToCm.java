package Homework1_Radoslav_Dishev;

import java.util.Scanner;

public class Task4_InchToCm {
	public static void main(String[] args) {
		System.out.println("Method 1:");
		double cm = 46.19;
		double inch = cm / 2.54;
		System.out.println(inch);
		
		System.out.println("Method 2:");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter value in cm");
		
		Double cm2 = myObj.nextDouble();
		Double inch2 = cm2 / 2.54;
		System.out.println(inch2);
	}
}
