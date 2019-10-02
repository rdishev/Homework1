package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumofdigits = 0;
		int number = sc.nextInt();
		while (number > 0) {
			int nextdigit = number % 10;
			sumofdigits = sumofdigits + nextdigit;
			number = number / 10;
		}
		System.out.println(sumofdigits);
	}
}
