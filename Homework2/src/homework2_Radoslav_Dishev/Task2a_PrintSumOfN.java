package homework2_Radoslav_Dishev;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= count; i++) {
			int number = sc.nextInt();
			sum = sum + number;
		}
		System.out.println(sum);
	}
}
