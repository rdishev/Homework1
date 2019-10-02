package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i <= 0) {
				System.out.print(i + " ");
			}
		} 
	}
}
