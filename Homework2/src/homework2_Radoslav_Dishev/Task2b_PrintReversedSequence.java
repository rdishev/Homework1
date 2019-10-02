package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task2b_PrintReversedSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String reverse = "";
		for (int i = 1; i <= count; i++) {
			int nextnumber = sc.nextInt();
			reverse = nextnumber + " " + reverse;
		}
		System.out.println(reverse);
	}
}
