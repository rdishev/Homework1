package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mirrornumber = "";
		int number = sc.nextInt();
		while (number > 0) {
			int nextdigit = number % 10;
			mirrornumber = mirrornumber + nextdigit;
			number = number / 10;
		}
		System.out.println(mirrornumber);
	}
}
