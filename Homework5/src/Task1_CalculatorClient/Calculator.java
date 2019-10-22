package Task1_CalculatorClient;

import java.util.Scanner;

public class Calculator {

	public static float SUM (float a, float b) {
		return a + b;
	}
	
	public static float SUB (float a, float b) {
		return b - a;
	}
	
	public static float MUL (float a, float b) {
		return a*b;
	}
	
	public static float DIV (float a, float b) {
		return a/b;
	}
	
	public static float PER (float a, float b) {
		return b/a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String calc = sc.next();
		while (!"END".contentEquals(calc)) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			switch (calc) {
				case "END":
					break;
				case "SUM":
					System.out.printf("%.3f",SUM(a,b)); 
					System.out.println(); break;
				case "SUB":
					System.out.printf("%.3f",SUB(a,b)); 
					System.out.println(); break;
				case "MUL":
					System.out.printf("%.3f",MUL(a,b)); 
					System.out.println(); break;
				case "DIV":
					System.out.printf("%.3f",DIV(a,b)); 
					System.out.println(); break;
				case "PER":
					System.out.printf("%.3f",PER(a,b)); 
					System.out.println(); break;
				default:
					System.out.println("Wrong input"); break;
			}
			calc = sc.next();
		}
	}
}
