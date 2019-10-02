package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (number > 10) {
			number = number / 10;
		}
		System.out.println(number);
	}
}
