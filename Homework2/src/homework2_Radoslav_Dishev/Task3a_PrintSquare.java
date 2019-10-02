package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task3a_PrintSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int squareside = sc.nextInt();
		for (int j = 1; j <= squareside; j++) {
			System.out.print("* ");
			if (j >= squareside) {
				System.out.println();
				}
			}
		for (int l = 3; l <= squareside; l++) {
			for (int k = 1; k <= squareside; k++) {
				if (k <= 1) {
					System.out.print("*");
				}
				else if (k < squareside) {
					System.out.print("  ");
				}
				else {
					System.out.println(" *");
				}
			}
		}
		for (int i = 1; i <= squareside; i++) {
				System.out.print("* ");
		}
	}
}
