package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task3b_PrintZFigure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int l = 1; l <= number; l++) {
					System.out.print("* ");
		}
		System.out.println();
		for (int i = number - 1; i > 0; i--) {
			for (int n = 2; n <= i; n++) {
				System.out.print("  ");
				if (n >= i) {
					System.out.println("*");
				}
			}
		}
		for (int j = 1; j <= number; j++) {
					System.out.print("* ");
		}
	}
}